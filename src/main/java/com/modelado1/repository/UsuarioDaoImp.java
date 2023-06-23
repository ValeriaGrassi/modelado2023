package com.modelado1.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.modelado1.entity.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public List<Usuario> obtenerUsuarios() {
		String query="from Usuario";
		return entityManager.createQuery(query).getResultList()
		;
	}

}
