package com.SpringBoot.projetosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

@RestController
@RequestMapping("/shows")
@CrossOrigin(origins = "*")

public class ShowFilmeController {

    @Autowired
    private ShowFilmeRepository repository;

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

        BancoShowFilmes ultimaMidia = shows.isEmpty()
                ? null
                : shows.get(shows.size() - 1);

        BancoShowFilmes ultimaMidiaCadastrada = shows.isEmpty()
                ? null
                : shows.get(shows.size() - 1);

        long totalTipos = shows.stream()
                .map(show -> show.getTipo())
                .filter(tipo -> tipo != null && !tipo.trim().isEmpty())
                .distinct()
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

        dados.put("ultimaMidia", ultimaMidia);
        dados.put("ultimaMidiaCadastrada", ultimaMidiaCadastrada);

        dados.put("totalMidias", totalMidias);
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
