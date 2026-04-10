package com.SpringBoot.projetosspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Map;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

    List<Despesa> findTop5ByOrderByDataDesc();

    List<Despesa> findByUsuario(String usuario);

    List<Despesa> findByUsuarioAndDescricaoContainingIgnoreCase(String usuario, String descricao);

@Query("SELECT SUM(d.valor) FROM Despesa d WHERE d.usuario = :usuario AND d.tipo = :tipo")
Double sumByUsuarioETipo(String usuario, String tipo);


@Query("""
SELECT SUM(d.valor)
FROM Despesa d
WHERE d.usuario = :usuario
AND EXTRACT(MONTH FROM d.data) = EXTRACT(MONTH FROM CURRENT_DATE)
""")
Double totalMesAtual(String usuario);


@Query("""
SELECT d.status, COUNT(d)
FROM Despesa d
WHERE d.usuario = :usuario
GROUP BY d.status
""")
List<Object[]> contarStatusRaw(String usuario);

}
