package com.SpringBoot.projetosspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamiliaRepository extends JpaRepository<Familia, Integer> {

    List<Familia> findByIntegranteContainingIgnoreCase(String integrante);

}