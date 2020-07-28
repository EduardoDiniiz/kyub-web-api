package com.kyub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyub.model.entity.Usuario;
import com.kyub.service.UserService;

@RestController("api/usuarios")
public class UsuarioController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	public Usuario Save(Usuario user) {
		return userService.Save(user);
	}

}
