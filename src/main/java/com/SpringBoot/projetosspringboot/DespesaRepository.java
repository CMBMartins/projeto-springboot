package com.SpringBoot.projetosspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

    List<Despesa> findByUsuario(String usuario);

    List<Despesa> findByUsuarioAndDescricaoContainingIgnoreCase(String usuario, String descricao);

    List<Despesa> findTop5ByOrderByDataDesc();

    // 💰 RENDA
    @Query("SELECT COALESCE(SUM(d.valor), 0) FROM Despesa d WHERE d.usuario = :usuario AND LOWER(d.tipo) = 'entrada'")
    Double somarRenda(@Param("usuario") String usuario);

    // 💸 DESPESAS
    @Query("SELECT COALESCE(SUM(d.valor), 0) FROM Despesa d WHERE d.usuario = :usuario AND LOWER(d.tipo) = 'saida'")
    Double somarTotal(@Param("usuario") String usuario);

    // 💰 SALDO
    @Query("SELECT COALESCE(SUM(CASE WHEN LOWER(d.tipo) = 'entrada' THEN d.valor ELSE -d.valor END), 0) FROM Despesa d WHERE d.usuario = :usuario")
    Double calcularSaldo(@Param("usuario") String usuario);

    // 📅 MÊS ATUAL
    @Query("SELECT COALESCE(SUM(d.valor), 0) FROM Despesa d WHERE d.usuario = :usuario AND FUNCTION('MONTH', d.data) = FUNCTION('MONTH', CURRENT_DATE) AND FUNCTION('YEAR', d.data) = FUNCTION('YEAR', CURRENT_DATE)")
    Double somarMes(@Param("usuario") String usuario);
}
