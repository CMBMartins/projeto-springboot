package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) {

        return repository
                .findByUsuarioAndSenha(usuario.getUsuario(), usuario.getSenha())
                .orElse(null);

    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    // BUSCAR POR Integrante
    @GetMapping("/buscar")
    public List<Usuario> buscarPorUsuario(@RequestParam String usuario) {
        return repository.findByUsuarioContainingIgnoreCase(usuario);
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return repository.save(usuario);
    }
}