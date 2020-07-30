package com.kyub.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kyub.model.entity.Usuario;
import com.kyub.model.entity.dto.UsuarioDto;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

	UsuarioDto toDto(Usuario usuario);

	Usuario toModel(UsuarioDto usuarioDto);

}
