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
	public Usuario findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return this.usuarioRepository.findById(id).orElseThrow(() -> new Exception("Não encontrado registros"));
	}

	@Override
	public void update(Long id, Usuario userUpdate) {
		userUpdate.setId(id);
		this.usuarioRepository.save(userUpdate);
	}

	@Override
	public Usuario save(Usuario newUser) {
		newUser.setDataCadastro(LocalDateTime.now());
		return this.usuarioRepository.save(newUser);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws Exception {
		Usuario usuario = this.findById(id);
		this.usuarioRepository.delete(usuario);

	}

}
