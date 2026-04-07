package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.familia.model.Familia;
//import com.familia.repository.FamiliaRepository;

@Service
public class FamiliaService {

    @Autowired
    private FamiliaRepository repository;

    public Familia salvar(Familia familia) {
        return repository.save(familia);
    }

    public List<Familia> listar() {
        return repository.findAll();
    }
}