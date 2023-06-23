package com.modelado1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.modelado1.entity.Usuario;
import com.modelado1.repository.UsuarioDao;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@GetMapping("mensaje")
	public String mensaje() {
		return "Hola Valeria";
	} 
	
	@GetMapping("persona")
	public List <String> listarPersonas(){
		return List.of("Valeria","Elena","Tatiana");
	}
	
	@GetMapping("usuario")
	public Usuario listarUsuarios() {
		Usuario usuario=new Usuario();
		usuario.setNombre("Valeria");
		usuario.setApellido("Grassi");
		usuario.setEmail("valeegrassi@gmail.com");
		usuario.setTelefono("2613371266");
		
		return usuario;
	 }
	
	@GetMapping("usuario/{id}")
	public Usuario getUsuarios(@PathVariable Long id) {
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Valeria");
		usuario.setApellido("Grassi");
		usuario.setEmail("valeegrassi@gmail.com");
		usuario.setTelefono("2613371266");
		
		return usuario;
	 }


	@GetMapping("usuario/lista_user")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Valeria");
		usuario1.setApellido("Grassi");
		usuario1.setEmail("valeegrassi@gmail.com");
		usuario1.setTelefono("2613371266");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Gastón");
		usuario2.setApellido("Ascurra");
		usuario2.setEmail("gastongames888@gmail.com");
		usuario2.setTelefono("2613736129");
	
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Tatiana");
		usuario3.setApellido("Ascurra");
		usuario3.setEmail("tatiascurra@gmail.com");
		usuario3.setTelefono("-");
		
		Usuario usuario4=new Usuario();
		usuario4.setId(5L);
		usuario4.setNombre("Elena");
		usuario4.setApellido("Ascurra");
		usuario4.setEmail("-");
		usuario4.setTelefono("-");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
		return usuarios;
	 }
	
	@GetMapping("api/usuarios")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}

}
