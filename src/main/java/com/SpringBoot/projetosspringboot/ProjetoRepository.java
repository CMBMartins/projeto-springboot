package com.SpringBoot.projetosspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {

    List<Projeto> findByClienteContainingIgnoreCase(String cliente);

}