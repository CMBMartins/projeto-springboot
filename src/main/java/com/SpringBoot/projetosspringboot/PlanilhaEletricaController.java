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

    @PostMapping
    public PlanilhaEletrica salvar(@RequestBody PlanilhaEletrica novo) {

        double pt = novo.getPotenciatotal();
        double tensao = 127;

        double ib = pt / tensao;
        double ic = ib * 1.42;

        // double fator = 0.66;
        // double tensao = 127;

        // double corrigida = pt * fator;
        // double ic = corrigida / tensao;
        // double ib = ic * 1.428;

        novo.setPotenciacorrigida(arred(pt));
        novo.setCorrenteic(arred(ic));
        novo.setCorrenteib(arred(ib));

        String tipo = novo.getTipocircuito();

        if ("Tomada".equalsIgnoreCase(tipo)) {

            if (ic <= 20) {
                novo.setCondutor("2,5 mm²");
                novo.setDisjuntor("20A");
            } else if (ic <= 28) {
                novo.setCondutor("4 mm²");
                novo.setDisjuntor("25A");
            } else {
                novo.setCondutor("6 mm²");
                novo.setDisjuntor("32A");
            }

        } else if ("Iluminacao".equalsIgnoreCase(tipo)) {

            novo.setCondutor("1,5 mm²");
            novo.setDisjuntor("10A");
        }

        return repository.save(novo);
    }

    @GetMapping
    public List<PlanilhaEletrica> listar() {
        return repository.findAll();
    }

    @GetMapping("/buscar")
    public List<PlanilhaEletrica> buscarPorCliente(@RequestParam String circuito) {
        return repository.findByCircuitoContainingIgnoreCase(circuito);
    }

    @GetMapping("/usuario")
    public List<PlanilhaEletrica> listarPorUsuario(@RequestParam String usuario) {
        return repository.findByUsuario(usuario);
    }

    private double arred(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}