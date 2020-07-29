package com.kyub.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kyub.model.entity.Usuario;
import com.kyub.service.UserService;

import io.swagger.annotations.Api;

@RestController
@Api(value = "usuarios")
@RequestMapping("api/usuarios")
public class UsuarioController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Usuario> Save(@RequestBody Usuario user) {
		Usuario newUsuario = userService.Save(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUsuario.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

}
