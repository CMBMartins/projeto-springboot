package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository repository;

    public Despesa salvar(Despesa despesa) {
        return repository.save(despesa);
    }

    public List<Despesa> listar() {
        return repository.findAll();
    }
}