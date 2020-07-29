package com.kyub.model.entity.dto;

import lombok.Data;

@Data
public class UsuarioDto {
	private Long id;
	private String nome;
	private String email;
	private String senha;
}
