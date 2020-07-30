package com.kyub.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kyub.mapper.UsuarioMapper;
import com.kyub.model.entity.Usuario;
import com.kyub.model.entity.dto.UsuarioDto;
import com.kyub.repository.UsuarioRepository;
import com.kyub.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsuarioMapper userMapper;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Override
	public UsuarioDto findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Usuario usuario = this.usuarioRepository.findById(id)
				.orElseThrow(() -> new Exception("Não encontrado registros"));
		UsuarioDto dto = this.userMapper.toDto(usuario);
		return dto;
	}

	@Override
	public void update(Long id, UsuarioDto userUpdate) {
		Usuario user = this.userMapper.toModel(userUpdate);
		userUpdate.setId(id);
		this.usuarioRepository.save(user);
	}

	@Override
	public UsuarioDto save(UsuarioDto newUser) {
		Usuario user = this.userMapper.toModel(newUser);
		user.setSenha(bcrypt.encode(newUser.getSenha()));
		user.setDataCadastro(LocalDateTime.now());
		return this.userMapper.toDto(this.usuarioRepository.save(user));
	}

	@Override
	public List<UsuarioDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws Exception {
		UsuarioDto usuario = this.findById(id);
		this.usuarioRepository.delete(this.userMapper.toModel(usuario));

	}

}
