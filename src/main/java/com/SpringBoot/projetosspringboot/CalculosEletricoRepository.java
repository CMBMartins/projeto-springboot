package com.SpringBoot.projetosspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CalculosEletricoRepository extends JpaRepository<CalculosEletrico, Long> {
    List<CalculosEletrico> findByAmbienteContainingIgnoreCase(String ambiente);

    List<CalculosEletrico> findByUsuario(String usuario);
}