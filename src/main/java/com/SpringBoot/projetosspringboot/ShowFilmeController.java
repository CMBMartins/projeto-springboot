package com.SpringBoot.projetosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

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
