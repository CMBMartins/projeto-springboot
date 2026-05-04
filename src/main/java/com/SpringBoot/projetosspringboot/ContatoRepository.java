package com.SpringBoot.projetosspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

    List<Contato> findByNomeContainingIgnoreCase(String nome);

    List<Contato> findByUsuario(String usuario);

}