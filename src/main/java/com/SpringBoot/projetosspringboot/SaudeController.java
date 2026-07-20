package com.SpringBoot.projetosspringboot;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saude")
@CrossOrigin(origins = "*")

public class SaudeController {

        @Autowired
        private SaudeRepository repository;

        // Método Post de Salvar
        @PostMapping
        public Saude salvar(@RequestBody Saude saude) {
                return repository.save(saude);
        }

        // Método Excluir
        @DeleteMapping("/{id}")
        public ResponseEntity<?> deletar(@PathVariable Integer id) {

                return repository.findById(id)
                                .map(registro -> {

                                        repository.delete(registro);

                                        return ResponseEntity.ok("Registro excluído com sucesso");

                                }).orElse(ResponseEntity.notFound().build());
        }

        // Método Editar Completo
        @PutMapping("/{id}")
        public Saude editar(@PathVariable Integer id, @RequestBody Saude nova) {

                Saude existente = repository.findById(id)
                                .orElseThrow(() -> new RuntimeException("Saude não encontrada"));

                existente.setDescricao(nova.getDescricao());
                existente.setCategoria(nova.getCategoria());
                existente.setValor(nova.getValor());
                existente.setStatus(nova.getStatus());
                existente.setData(nova.getData());

                return repository.save(existente);
        }

        // Método Atualizar Somente Status
        @PutMapping("/status/{id}")
        public ResponseEntity<?> atualizarStatus(
                        @PathVariable Integer id,
                        @RequestBody Saude saude) {

                return repository.findById(id)
                                .map(registro -> {

                                        registro.setStatus(saude.getStatus());

                                        repository.save(registro);

                                        return ResponseEntity.ok(registro);
                                })
                                .orElse(ResponseEntity.notFound().build());
        }

        // Método Get para Listar Todos
        @GetMapping
        public List<Saude> listar() {
                return repository.findAll();
        }

        // Método Get por Id
        @GetMapping("/{id}")
        public Saude buscarPorId(@PathVariable Integer id) {
                return repository.findById(id).orElse(null);
        }

        // Método Get Buscar por Usuario
        @GetMapping("/usuario")
        public List<Despesa> listarPorUsuario(@RequestParam String usuario) {
                return repository.findByUsuario(usuario);
        }

        // Método Get Buscar por Categoria
        @GetMapping("/buscar/categoria")
        public List<Saude> buscarPorCategoria(@RequestParam String categoria) {
                return repository.findByCategoriaContainingIgnoreCase(categoria);
        }

        // Método Get Buscar por ÚLTIMAS 5
        @GetMapping("/ultimas")
        public List<Saude> ultimas() {
                return repository.findTop5ByOrderByDataDesc();
        }

        // Método Get Buscar por Total
        @GetMapping("/total")
        public Double totalSaidas(@RequestParam String usuario) {
                return repository.findByUsuario(usuario)
                                // return repository.findAll()
                                .stream()
                                .filter(d -> d.getStatus() != null &&
                                                d.getStatus().equalsIgnoreCase("PAGA") ||
                                                (d.getStatus().equalsIgnoreCase("PENDENTE")))
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();
        }

        // Método Get Buscar TOTAL DE RENDAS
        @GetMapping("/renda")
        public Double totalEntradas(@RequestParam String usuario) {
                return repository.findByUsuario(usuario)
                                // return repository.findAll()
                                .stream()
                                .filter(d -> d.getStatus() != null &&
                                                (d.getStatus().equalsIgnoreCase("RECEBIDO")))
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();
        }

        // Método Get Buscar por SALDO TOTAL
        @GetMapping("/saldo")
        public Double calcularSaldo(@RequestParam String usuario) {
                double despesas = repository.findByUsuario(usuario)
                                // double despesas = repository.findAll()
                                .stream()
                                .filter(d -> d.getStatus() != null &&
                                                (d.getStatus().equalsIgnoreCase("PAGA") ||
                                                                d.getStatus().equalsIgnoreCase("PENDENTE")))
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();

                double receitas = repository.findByUsuario(usuario)
                                .stream()
                                .filter(d -> d.getStatus() != null &&
                                                d.getStatus().equalsIgnoreCase("RECEBIDO"))
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();

                return receitas - despesas;
        }

        // Método Get Buscar por GRAFICO POR CATEGORIA
        @GetMapping("/categoria")
        public Map<String, Double> porCategoria(@RequestParam String usuario) {
                return repository.findByUsuario(usuario)
                                // return repository.findAll()
                                .stream()
                                .collect(Collectors.groupingBy(
                                                d -> d.getCategoria() != null ? d.getCategoria() : "Outros",
                                                Collectors.summingDouble(
                                                                d -> d.getValor() != null ? d.getValor() : 0.0)));
        }

        // Método Get Buscar por STATUS
        @GetMapping("/status")
        public Map<String, Long> status(@RequestParam String usuario) {
                return repository.findByUsuario(usuario)
                                // return repository.findAll()
                                .stream()
                                .collect(Collectors.groupingBy(
                                                d -> d.getStatus() != null ? d.getStatus().toUpperCase() : "OUTRO",
                                                Collectors.counting()));
        }

        // Método Get Buscar por DESPESAS POR MÊS
        @GetMapping("/mensal")
        public Map<Integer, Double> despesasPorMes(@RequestParam String usuario) {

                return repository.findByUsuario(usuario)
                                .stream()
                                .filter(d -> d.getData() != null)

                                .collect(Collectors.groupingBy(
                                                d -> d.getData().getMonthValue(), // 🔥 1 a 12

                                                Collectors.summingDouble(d -> {

                                                        if (d.getValor() == null)
                                                                return 0.0;
                                                        if (d.getTipo() == null)
                                                                return 0.0;

                                                        if (d.getTipo().equalsIgnoreCase("entrada")) {
                                                                return d.getValor(); // soma
                                                        }

                                                        if (d.getTipo().equalsIgnoreCase("saida")) {
                                                                return -d.getValor(); // subtrai
                                                        }

                                                        return 0.0;
                                                })));
        }

        // Método Get Buscar por VALOR DE DESPESAS POR MÊS
        @GetMapping("/mes")
        public Double totalPagoNoMes(@RequestParam String usuario) {

                LocalDate hoje = LocalDate.now();

                return repository.findByUsuario(usuario)
                                .stream()

                                // 📅 FILTRO DE DATA (mês atual)
                                .filter(d -> d.getData() != null &&
                                                d.getData().getMonthValue() == hoje.getMonthValue() &&
                                                d.getData().getYear() == hoje.getYear())

                                // 💰 FILTRO POR STATUS (AGORA SIM)
                                .filter(d -> d.getStatus() != null &&
                                                (d.getStatus().equalsIgnoreCase("PAGA") ||
                                                                d.getStatus().equalsIgnoreCase("PENDENTE")))

                                // 💸 SOMA
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();
        }

        // Método Get Buscar por COMPARATIVO DE DESPESAS MENSAIS
        @GetMapping("/comparativo-mensal")
        public Map<String, Double> comparativoMensal(@RequestParam String usuario) {
                // return repository.findByUsuario(usuario)
                LocalDate hoje = LocalDate.now();
                LocalDate mesAnterior = hoje.minusMonths(1);

                double atual = repository.findByUsuario(usuario)
                                .stream()
                                .filter(d -> d.getData() != null &&
                                                d.getData().getMonthValue() == hoje.getMonthValue() &&
                                                d.getData().getYear() == hoje.getYear())
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();

                double anterior = repository.findAll()
                                .stream()
                                .filter(d -> d.getData() != null &&
                                                d.getData().getMonthValue() == mesAnterior.getMonthValue() &&
                                                d.getData().getYear() == mesAnterior.getYear())
                                .mapToDouble(d -> d.getValor() != null ? d.getValor() : 0.0)
                                .sum();

                Map<String, Double> result = new HashMap<>();
                result.put("atual", atual);
                result.put("anterior", anterior);

                return result;
        }

}