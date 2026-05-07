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

        double fator = 1.00;

        if ("Iluminacao".equalsIgnoreCase(novo.getTipocircuito())) {
            fator = 1.00;
        } else if ("Tomada".equalsIgnoreCase(novo.getTipocircuito())) {
            fator = 1.20;
        } else if ("Motor".equalsIgnoreCase(novo.getTipocircuito())) {
            fator = 1.30;
        }

        double corrigida = pt * fator;
        double ic = corrigida / 220.0;
        double ib = ic * 1.25;

        novo.setPotenciacorrigida(arred(corrigida));
        novo.setCorrenteic(arred(ic));
        novo.setCorrenteib(arred(ib));

        if (ib <= 10) {
            novo.setDisjuntor("10A");
            novo.setCondutor("1,5 mm²");
        } else if (ib <= 16) {
            novo.setDisjuntor("16A");
            novo.setCondutor("2,5 mm²");
        } else if (ib <= 20) {
            novo.setDisjuntor("20A");
            novo.setCondutor("4 mm²");
        } else if (ib <= 32) {
            novo.setDisjuntor("32A");
            novo.setCondutor("6 mm²");
        } else {
            novo.setDisjuntor("50A");
            novo.setCondutor("10 mm²");
        }

        return repository.save(novo);
    }

    @GetMapping
    public List<PlanilhaEletrica> listar() {
        return repository.findAll();
    }

    private double arred(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}