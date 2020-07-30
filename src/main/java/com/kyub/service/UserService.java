package com.kyub.service;

import java.util.List;

import com.kyub.model.entity.Usuario;
import com.kyub.model.entity.dto.UsuarioDto;

public interface UserService {
	UsuarioDto findById(Long id) throws Exception;
	void update (Long id, UsuarioDto userUpdate);
	UsuarioDto save(UsuarioDto newUser);
	List <UsuarioDto> findAll();
	void delete(Long id) throws Exception;
}
