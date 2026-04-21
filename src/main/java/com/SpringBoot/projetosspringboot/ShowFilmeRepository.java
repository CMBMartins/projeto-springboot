package com.bancoshows.bancoshowsfilmes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ShowFilmeRepository extends JpaRepository<BancoShowFilmes, Long> {
    List<BancoShowFilmes> findByArtistaContainingIgnoreCase(String artista);
    List<BancoShowFilmes> findByUsuario(String usuario);   
}