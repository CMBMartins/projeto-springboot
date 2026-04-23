package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projetos")
@CrossOrigin(origins = "*")
public class ProjetoController {

    @Autowired
    private ProjetoRepository repository;

    @GetMapping
    public List<Projeto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Projeto salvar(@RequestBody Projeto projeto) {
        return repository.save(projeto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Projeto buscarPorId(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/buscar")
    public List<Projeto> buscarPorCliente(@RequestParam String cliente) {
        return repository.findByClienteContainingIgnoreCase(cliente);
    }

    @PutMapping("/{id}")
    public Projeto atualizar(@PathVariable Integer id, @RequestBody Projeto projeto) {
        projeto.setId(id);
        return repository.save(projeto);
    }

    // ✅ CORRETO
    @PutMapping("/{id}/genero")
    public Projeto atualizarGenero(@PathVariable Integer id, @RequestBody Projeto dados) {

        Projeto projeto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));

        projeto.setGenero(dados.getGenero());

        return repository.save(projeto);
    }
}