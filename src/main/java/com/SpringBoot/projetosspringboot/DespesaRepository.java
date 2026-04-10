package com.SpringBoot.projetosspringboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

    List<Despesa> findTop5ByOrderByDataDesc();

    List<Despesa> findByUsuario(String usuario);

    List<Despesa> findByUsuarioAndDescricaoContainingIgnoreCase(String usuario, String descricao);

    // 🔥 TOTAL POR TIPO
    @Query("SELECT SUM(d.valor) FROM Despesa d WHERE d.usuario = :usuario AND d.tipo = :tipo")
    Double sumByUsuarioETipo(@Param("usuario") String usuario,
                            @Param("tipo") String tipo);

    // 📅 MÊS ATUAL
    @Query("""
        SELECT SUM(d.valor)
        FROM Despesa d
        WHERE d.usuario = :usuario
        AND FUNCTION('MONTH', d.data) = FUNCTION('MONTH', CURRENT_DATE)
    """)
    Double totalMesAtual(@Param("usuario") String usuario);

    // 📊 STATUS
    @Query("""
        SELECT d.status, COUNT(d)
        FROM Despesa d
        WHERE d.usuario = :usuario
        GROUP BY d.status
    """)
    List<Object[]> contarStatusRaw(@Param("usuario") String usuario);
}
