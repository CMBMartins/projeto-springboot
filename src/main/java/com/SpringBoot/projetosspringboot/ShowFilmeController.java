package com.SpringBoot.projetosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.List;

@RestController
@RequestMapping("/shows")
@CrossOrigin(origins = "*")

public class ShowFilmeController {

        @Autowired
        private ShowFilmeRepository repository;

        private final List<SseEmitter> emitters = new CopyOnWriteArrayList<>();

        // ==========================================================
        // SSE - CONEXÃO DO DASHBOARD
        // ==========================================================
        @GetMapping(value = "/eventos", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
        public SseEmitter eventos() {

                SseEmitter emitter = new SseEmitter(0L);

                emitters.add(emitter);

                emitter.onCompletion(() -> emitters.remove(emitter));
                emitter.onTimeout(() -> emitters.remove(emitter));
                emitter.onError(erro -> emitters.remove(emitter));

                try {

                        emitter.send(
                                        SseEmitter.event()
                                                        .name("conectado")
                                                        .data("Conexão SSE estabelecida"));

                } catch (IOException erro) {

                        emitters.remove(emitter);
                }

                return emitter;
        }

        @GetMapping("/grafico-generos")
        public Map<String, Long> graficoGeneros(@RequestParam String usuario) {

                List<BancoShowFilmes> shows = repository.findByUsuario(usuario);

                return shows.stream()
                                .filter(show -> show.getGenero() != null)
                                .collect(Collectors.groupingBy(
                                                show -> show.getGenero(),
                                                Collectors.counting()));
        }

        @PutMapping("/{id}/situacao")
        public BancoShowFilmes atualizarSituacao(@PathVariable Long id, @RequestBody Map<String, String> dados) {

                BancoShowFilmes show = repository.findById(id)
                                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));

                String novaSituacao = dados.get("situacao");

                if (novaSituacao == null || novaSituacao.isEmpty()) {
                        throw new RuntimeException("Situação inválida");
                }

                show.setSituacao(novaSituacao);

                return repository.save(show);
        }

        @PutMapping("/{id}")
        public BancoShowFilmes atualizar(@PathVariable Long id, @RequestBody BancoShowFilmes novo) {

                BancoShowFilmes existente = repository.findById(id)
                                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));

                existente.setCodigo(novo.getCodigo());
                existente.setTitulo(novo.getTitulo());
                existente.setArtista(novo.getArtista());
                existente.setAnodelancamento(novo.getAnodelancamento());
                existente.setDatadacompra(novo.getDatadacompra());
                existente.setSituacao(novo.getSituacao());
                existente.setTipo(novo.getTipo());
                existente.setGenero(novo.getGenero());
                existente.setUsuario(novo.getUsuario());

                return repository.save(existente);
        }

        @GetMapping
        public List<BancoShowFilmes> listar() {
                return repository.findAll();
        }

        @GetMapping("/usuario")
        public List<BancoShowFilmes> buscarPorUsuario(@RequestParam String usuario) {
                return repository.findByUsuario(usuario);
        }

        @GetMapping("/dashboard")
        public Map<String, Object> dashboard(@RequestParam String usuario) {

                List<BancoShowFilmes> shows = repository.findByUsuario(usuario);

                Map<String, Object> dados = new HashMap<>();

                long totalMidias = shows.size();

                long disponiveis = shows.stream()
                                .filter(show -> "EmArquivo".equalsIgnoreCase(show.getSituacao()))
                                .count();

                long emprestadas = shows.stream()
                                .filter(show -> "Emprestado".equalsIgnoreCase(show.getSituacao()))
                                .count();

                double percentualMidias = totalMidias > 0
                                ? (disponiveis * 100.0) / totalMidias
                                : 0.0;

                BancoShowFilmes ultimaDVD = shows.stream()
                                .filter(show -> "DVD".equalsIgnoreCase(show.getTipo()))
                                .reduce((primeiro, segundo) -> segundo)
                                .orElse(null);

                BancoShowFilmes ultimaBluRay = shows.stream()
                                .filter(show -> "Blu ray".equalsIgnoreCase(show.getTipo()))
                                .reduce((primeiro, segundo) -> segundo)
                                .orElse(null);

                BancoShowFilmes ultimaDigital = shows.stream()
                                .filter(show -> "Digital".equalsIgnoreCase(show.getTipo()))
                                .reduce((primeiro, segundo) -> segundo)
                                .orElse(null);

                BancoShowFilmes ultimaMidiaCadastrada = shows.isEmpty()
                                ? null
                                : shows.get(shows.size() - 1);

                long totalTipos = shows.stream()
                                .map(show -> show.getTipo())
                                .filter(tipo -> tipo != null && !tipo.trim().isEmpty())
                                .distinct()
                                .count();
                long quantidadeDVD = shows.stream()
                                .filter(show -> "DVD".equalsIgnoreCase(show.getTipo()))
                                .count();

                long quantidadeBluRay = shows.stream()
                                .filter(show -> "Blu-ray".equalsIgnoreCase(show.getTipo()))
                                .count();

                long quantidadeDigital = shows.stream()
                                .filter(show -> "Digital".equalsIgnoreCase(show.getTipo()))
                                .count();

                String tipoMaisUtilizado = shows.stream()
                                .map(show -> show.getTipo())
                                .filter(tipo -> tipo != null && !tipo.trim().isEmpty())
                                .collect(Collectors.groupingBy(
                                                tipo -> tipo,
                                                Collectors.counting()))
                                .entrySet()
                                .stream()
                                .max(Map.Entry.comparingByValue())
                                .map(entry -> entry.getKey())
                                .orElse("-");

                List<BancoShowFilmes> midiasEmprestadas = shows.stream()
                                .filter(show -> "Emprestado".equalsIgnoreCase(show.getSituacao()))
                                .toList();

                dados.put("ultimaMidiaDVD", ultimaDVD);
                dados.put("ultimaMidiaBluRay", ultimaBluRay);
                dados.put("ultimaMidiaDigital", ultimaDigital);
                dados.put("ultimaMidiaCadastrada", ultimaMidiaCadastrada);

                dados.put("totalMidias", totalMidias);
                dados.put("quantidadeDVD", quantidadeDVD);
                dados.put("quantidadeBluRay", quantidadeBluRay);
                dados.put("quantidadeDigital", quantidadeDigital);
                dados.put("disponiveis", disponiveis);
                dados.put("emprestadas", emprestadas);

                dados.put("percentualMidias", percentualMidias);

                dados.put("totalTipos", totalTipos);
                dados.put("tipoMaisUtilizado", tipoMaisUtilizado);

                dados.put("midiasEmprestadas", midiasEmprestadas);

                return dados;
        }

        @GetMapping("/grafico-status")
        public Map<String, Long> graficoStatus(@RequestParam String usuario) {

                List<BancoShowFilmes> shows = repository.findByUsuario(usuario);

                return shows.stream()
                                .filter(show -> show.getSituacao() != null)
                                .collect(Collectors.groupingBy(
                                                show -> show.getSituacao(),
                                                Collectors.counting()));
        }

        // SALVAR
        @PostMapping
        public BancoShowFilmes salvar(@RequestBody BancoShowFilmes show) {
                return repository.save(show);
        }

        // DELETAR
        @DeleteMapping("/{id}")
        public void deletar(@PathVariable Long id) {
                repository.deleteById(id);
        }

        // BUSCAR POR ARTISTA
        @GetMapping("/buscar")
        public List<BancoShowFilmes> buscar(@RequestParam String artista) {
                return repository.findByArtistaContainingIgnoreCase(artista);
        }
}
