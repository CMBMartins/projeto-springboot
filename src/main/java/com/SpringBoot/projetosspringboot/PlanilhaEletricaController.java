package com.SpringBoot.projetosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import java.util.List;

@RestController
@RequestMapping("/planilha")
@CrossOrigin(origins = "*")

public class PlanilhaEletricaController {

    @Autowired
    private PlanilhaEletricaRepository repository;

    @PutMapping("/{id}/tipocircuito")
    public PlanilhaEletrica atualizarTipocircuito(@PathVariable Long id, @RequestBody Map<String, String> dados) {

        PlanilhaEletrica planilha = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));

        String novoCircuito = dados.get("tipocircuito");

        if (novoCircuito == null || novoCircuito.isEmpty()) {
            throw new RuntimeException("Circuito inválida");
        }

        planilha.setTipocircuito(novoCircuito);

        return repository.save(planilha);
    }

    @PutMapping("/{id}")
    public PlanilhaEletrica atualizar(@PathVariable Long id, @RequestBody PlanilhaEletrica novo) {

        PlanilhaEletrica existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));

        existente.setProjeto(novo.getProjeto());
        existente.setCircuito(novo.getCircuito());
        existente.setDescricao(novo.getDescricao());
        existente.setPotenciatotal(novo.getPotenciatotal());
        existente.setPotenciacorrigida(novo.getPotenciacorrigida());
        existente.setTipocircuito(novo.getTipocircuito());
        existente.setCorrenteic(novo.getCorrenteic());
        existente.setCorrenteib(novo.getCorrenteib());
        existente.setDisjuntor(novo.getDisjuntor());
        existente.setCondutor(novo.getCondutor());
        existente.setUsuario(novo.getUsuario());

        return repository.save(existente);
    }

    @GetMapping
    public List<PlanilhaEletrica> listar() {
        return repository.findAll();
    }

    @GetMapping("/usuario")
    public List<PlanilhaEletrica> buscarPorUsuario(@RequestParam String usuario) {
        return repository.findByUsuario(usuario);
    }

    // SALVAR
    @PostMapping
    public PlanilhaEletrica salvar(@RequestBody PlanilhaEletrica planilha) {
        return repository.save(planilha);
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // BUSCAR POR CIRCUITO
    @GetMapping("/buscar")
    public List<PlanilhaEletrica> buscar(@RequestParam String circuito) {
        return repository.findByCircuitoContainingIgnoreCase(circuito);
    }
}