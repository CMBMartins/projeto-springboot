package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaudeService {

    @Autowired
    private SaudeRepository repository;

    public Saude salvar(Saude saude) {
        return repository.save(saude);
    }

    public List<Saude> listar() {
        return repository.findAll();
    }
}