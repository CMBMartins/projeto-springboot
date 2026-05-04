package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contato")
@CrossOrigin(origins = "*")
public class ContatoController {

    @Autowired
    private ContatoRepository repository;

    @GetMapping
    public List<Contato> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Contato salvar(@RequestBody Contato contato) {
        return repository.save(contato);
    }

    @GetMapping("/usuario")
    public List<Contato> listarPorUsuario(@RequestParam String usuario) {
        return repository.findByUsuario(usuario);
    }

    @GetMapping("/buscar")
    public List<Contato> buscarPorNome(@RequestParam String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    @PutMapping("/{id}")
    public Contato editar(@PathVariable Integer id, @RequestBody Contato contato) {
        contato.setId(id);
        return repository.save(contato);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}