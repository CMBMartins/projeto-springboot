package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/familia")
@CrossOrigin(origins = "*")
public class FamiliaController {

    @Autowired
    private FamiliaRepository repository;

    @GetMapping
    public List<Familia> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Familia salvar(@RequestBody Familia familia) {
        return repository.save(familia);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Familia buscarPorId(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    // BUSCAR POR Integrante
    @GetMapping("/buscar")
    public List<Familia> buscarPorIntegrante(@RequestParam String integrante) {
        return repository.findByIntegranteContainingIgnoreCase(integrante);
    }

    @PutMapping("/{id}")
    public Familia atualizar(@PathVariable Integer id, @RequestBody Familia familia) {
        familia.setId(id);
        return repository.save(familia);
    }
}