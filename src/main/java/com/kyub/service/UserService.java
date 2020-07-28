package com.kyub.service;

import java.util.List;

import com.kyub.model.entity.Usuario;

public interface UserService {
	Usuario FindById(long id);
	void Update (long id, Usuario userUpdate);
	Usuario Save(Usuario newUser);
	List <Usuario> FindAll();		
}
