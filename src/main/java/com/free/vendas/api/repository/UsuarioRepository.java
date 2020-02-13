package com.free.vendas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.free.vendas.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
