package com.SpringBoot.projetosspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

    List<Despesa> findByUsuario(String usuario);

    List<Despesa> findTop5ByOrderByDataDesc();

    List<Despesa> findByUsuarioAndDescricaoContainingIgnoreCase(String usuario, String descricao);

    // 💰 RENDA
    @Query("""
    SELECT COALESCE(SUM(d.valor), 0)
    FROM Despesa d
    WHERE d.usuario = :usuario AND d.tipo = 'RECEITA'
    """)
    Double somarRenda(@Param("usuario") String usuario);

    // 💸 DESPESAS
    @Query("""
    SELECT COALESCE(SUM(d.valor), 0)
    FROM Despesa d
    WHERE d.usuario = :usuario AND d.tipo = 'DESPESA'
    """)
    Double somarTotal(@Param("usuario") String usuario);

    // 💰 SALDO
    @Query("""
    SELECT COALESCE(SUM(
        CASE 
            WHEN d.tipo = 'RECEITA' THEN d.valor 
            ELSE -d.valor 
        END
    ), 0)
    FROM Despesa d 
    WHERE d.usuario = :usuario
    """)
    Double calcularSaldo(@Param("usuario") String usuario);

    // 📅 MÊS ATUAL
    @Query("""
    SELECT COALESCE(SUM(d.valor), 0)
    FROM Despesa d
    WHERE d.usuario = :usuario
    AND EXTRACT(MONTH FROM d.data) = EXTRACT(MONTH FROM CURRENT_DATE)
    AND EXTRACT(YEAR FROM d.data) = EXTRACT(YEAR FROM CURRENT_DATE)
    """)
    Double somarMes(@Param("usuario") String usuario);
}
