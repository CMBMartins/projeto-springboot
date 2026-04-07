package com.SpringBoot.projetosspringboot;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByUsuarioContainingIgnoreCase(String usuario);

    Optional<Usuario> findByUsuarioAndSenha(String usuario, String senha);

}