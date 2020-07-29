package com.kyub.service;

import java.util.List;

import com.kyub.model.entity.Usuario;

public interface UserService {
	Usuario findById(Long id) throws Exception;
	void update (Long id, Usuario userUpdate);
	Usuario save(Usuario newUser);
	List <Usuario> findAll();
	void delete(Long id) throws Exception;
}
