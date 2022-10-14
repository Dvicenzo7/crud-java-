package com.hypeadvice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hypeadvice.demo.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
