package com.SpringBoot.projetosspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlanilhaEletricaRepository extends JpaRepository<PlanilhaEletrica, Long> {
    List<PlanilhaEletrica> findByCircuitoContainingIgnoreCase(String circuito);

    List<PlanilhaEletrica> findByUsuario(String usuario);
}