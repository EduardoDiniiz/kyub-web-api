package com.kyub.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyub.model.entity.Usuario;
import com.kyub.repository.UsuarioRepository;
import com.kyub.service.UserService;

@Service
public class UserServiceImpl implements UserService {

//	@Autowired
//	private UsuarioMapper userMapper;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario FindById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(long id, Usuario userUpdate) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario Save(Usuario newUser) {
		newUser.setDataCadastro(LocalDateTime.now());
		return this.usuarioRepository.save(newUser);
	}

	@Override
	public List<Usuario> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
