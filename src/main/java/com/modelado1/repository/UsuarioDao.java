package com.modelado1.repository;

import java.util.List;

import com.modelado1.entity.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	
	List<Usuario> obtenerUsuarios();

}
