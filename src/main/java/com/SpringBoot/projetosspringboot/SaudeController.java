package com.SpringBoot.projetosspringboot;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/saude")
@CrossOrigin(origins = "*")
public class SaudeController {

        @Autowired
        private SaudeRepository repository;

        // ============================
        // CRUD
        // ============================

        @PostMapping
        public Saude salvar(@RequestBody Saude saude) {
                return repository.save(saude);
        }

        @PostMapping("/camera")
        public ResponseEntity<?> leituraCamera(@RequestBody CameraDTO leitura) {

                Saude medicamento = repository
                                .findByCompartimento(leitura.getCompartimento())
                                .orElseThrow(() -> new RuntimeException("Compartimento não encontrado."));

                medicamento.setConsumido(true);
                medicamento.setHorarioConsumido(leitura.getDataHora().toLocalTime());
                medicamento.setUltimaLeituraCamera(leitura.getDataHora());

                repository.save(medicamento);

                return ResponseEntity.ok("Leitura da câmera registrada com sucesso.");
        }

        @GetMapping
        public List<Saude> listar() {
                return repository.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Saude> buscar(@PathVariable Integer id) {

                return repository.findById(id)
                                .map(ResponseEntity::ok)
                                .orElse(ResponseEntity.notFound().build());
        }

        @PutMapping("/{id}")
        public ResponseEntity<Saude> editar(
                        @PathVariable Integer id,
                        @RequestBody Saude novo) {

                return repository.findById(id)
                                .map(registro -> {

                                        registro.setMedicamento(novo.getMedicamento());
                                        registro.setCompartimento(novo.getCompartimento());
                                        registro.setHorarioPrevisto(novo.getHorarioPrevisto());
                                        registro.setHorarioConsumido(novo.getHorarioConsumido());
                                        registro.setConsumido(novo.getConsumido());
                                        registro.setAtrasado(novo.getAtrasado());
                                        registro.setCompartimentoVazio(novo.getCompartimentoVazio());
                                        registro.setStatusSensor(novo.getStatusSensor());
                                        registro.setUltimaLeituraCamera(novo.getUltimaLeituraCamera());
                                        registro.setUsuario(novo.getUsuario());

                                        return ResponseEntity.ok(repository.save(registro));

                                }).orElse(ResponseEntity.notFound().build());
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> excluir(@PathVariable Integer id) {

                return repository.findById(id)
                                .map(registro -> {

                                        repository.delete(registro);

                                        return ResponseEntity.ok("Registro excluído.");

                                }).orElse(ResponseEntity.notFound().build());

        }

        // ============================
        // CONSULTAS
        // ============================

        @GetMapping("/usuario")
        public List<Saude> listarPorUsuario(
                        @RequestParam String usuario) {

                return repository.findByUsuario(usuario);

        }

        @GetMapping("/proximo")
        public Saude proximoMedicamento(
                        @RequestParam String usuario) {

                return repository
                                .findTopByUsuarioAndConsumidoFalseOrderByHorarioPrevistoAsc(usuario)
                                .orElse(null);

        }

        @GetMapping("/ultimo")
        public Saude ultimoConsumido(
                        @RequestParam String usuario) {

                return repository
                                .findTopByUsuarioAndConsumidoTrueOrderByHorarioConsumidoDesc(usuario)
                                .orElse(null);

        }

        @GetMapping("/consumidos-hoje")
        public Long consumidosHoje(
                        @RequestParam String usuario) {

                return repository.countByUsuarioAndConsumidoTrue(usuario);

        }

        @GetMapping("/pendentes")
        public Long pendentes(
                        @RequestParam String usuario) {

                return repository.countByUsuarioAndConsumidoFalse(usuario);

        }

        @GetMapping("/atrasados")
        public Long atrasados(
                        @RequestParam String usuario) {

                return repository.countByUsuarioAndAtrasadoTrue(usuario);

        }

        @GetMapping("/dashboard")
        public DashboardSaudeDTO dashboard(@RequestParam String usuario) {

                DashboardSaudeDTO dto = new DashboardSaudeDTO();

                dto.setProximoMedicamento(
                                repository.findTopByUsuarioAndConsumidoFalseOrderByHorarioPrevistoAsc(usuario)
                                                .orElse(null));

                dto.setUltimoConsumido(
                                repository.findTopByUsuarioAndConsumidoTrueOrderByHorarioConsumidoDesc(usuario)
                                                .orElse(null));

                dto.setConsumidosHoje(
                                repository.countByUsuarioAndConsumidoTrue(usuario));

                dto.setPendentes(
                                repository.countByUsuarioAndConsumidoFalse(usuario));

                dto.setAtrasados(
                                repository.countByUsuarioAndAtrasadoTrue(usuario));

                dto.setCompartimentosVazios(
                                repository.countByCompartimentoVazioTrue());

                dto.setCompartimentosOcupados(
                                repository.countByCompartimentoVazioFalse());

                long total = dto.getConsumidosHoje() + dto.getPendentes();

                if (total == 0) {
                        dto.setAdesao(0.0);
                } else {
                        dto.setAdesao((dto.getConsumidosHoje() * 100.0) / total);
                }

                dto.setStatusSensor("ONLINE");

                return dto;
        }

        @GetMapping("/grafico-medicamentos")
        public Map<String, Long> graficoMedicamentos(@RequestParam String usuario) {

                return repository.findByUsuario(usuario)
                                .stream()
                                .collect(Collectors.groupingBy(
                                                Saude::getMedicamento,
                                                Collectors.counting()));
        }

        @GetMapping("/grafico-status")
        public Map<String, Long> graficoStatus(@RequestParam String usuario) {

                return repository.findByUsuario(usuario)
                                .stream()
                                .collect(Collectors.groupingBy(
                                                s -> s.getConsumido() ? "Consumido" : "Pendente",
                                                Collectors.counting()));
        }

        @GetMapping("/grafico-adesao")
        public Map<String, Double> graficoAdesao(@RequestParam String usuario) {

                long total = repository.findByUsuario(usuario).size();
                long consumidos = repository.countByUsuarioAndConsumidoTrue(usuario);
                double adesao = total == 0 ? 0 : (consumidos * 100.0) / total;

                Map<String, Double> retorno = new HashMap<>();

                retorno.put("Adesão", adesao);
                return retorno;
        }

        @GetMapping("/grafico-horarios")
        public Map<String, Long> graficoHorarios(@RequestParam String usuario) {

                return repository.findByUsuario(usuario)
                                .stream()
                                .filter(s -> s.getHorarioPrevisto() != null)
                                .collect(Collectors.groupingBy(
                                                s -> String.format("%02d:00", s.getHorarioPrevisto().getHour()),
                                                Collectors.counting()));
        }

}