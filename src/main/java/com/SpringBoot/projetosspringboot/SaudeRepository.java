package com.SpringBoot.projetosspringboot;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaudeRepository extends JpaRepository<Saude, Integer> {

    Optional<Saude> findByCompartimento(String compartimento);

    // Listar por usuário
    List<Saude> findByUsuario(String usuario);

    // Últimos registros
    List<Saude> findTop5ByOrderByUltimaLeituraCameraDesc();

    // Buscar medicamento
    List<Saude> findByMedicamentoContainingIgnoreCase(String medicamento);

    // Buscar compartimento
    List<Saude> findByCompartimentoContainingIgnoreCase(String compartimento);

    // Próximo medicamento
    Optional<Saude> findTopByUsuarioAndConsumidoFalseOrderByHorarioPrevistoAsc(String usuario);

    // Último medicamento consumido
    Optional<Saude> findTopByUsuarioAndConsumidoTrueOrderByHorarioConsumidoDesc(String usuario);

    // Quantidade consumida
    Long countByUsuarioAndConsumidoTrue(String usuario);

    // Quantidade pendente
    Long countByUsuarioAndConsumidoFalse(String usuario);

    // Quantidade atrasada
    Long countByUsuarioAndAtrasadoTrue(String usuario);

    // Compartimentos vazios
    Long countByUsuarioAndCompartimentoVazioTrue(String usuario);

    // Compartimentos ocupados
    Long countByUsuarioAndCompartimentoVazioFalse(String usuario);

}