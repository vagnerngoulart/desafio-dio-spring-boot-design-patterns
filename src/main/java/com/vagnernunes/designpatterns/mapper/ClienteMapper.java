package com.vagnernunes.designpatterns.mapper;

import com.vagnernunes.designpatterns.dto.ClienteDTO;
import com.vagnernunes.designpatterns.dto.ClienteCreateDTO;
import com.vagnernunes.designpatterns.dto.ClienteUpdateDTO;
import com.vagnernunes.designpatterns.entity.Cliente;
import org.mapstruct.*;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    ClienteDTO toDTO(Cliente cliente);
    List<ClienteDTO> toDTOList(List<Cliente> clientes);
    Cliente fromCreateDTO(ClienteCreateDTO dto);
    void updateFromDTO(ClienteUpdateDTO dto, @MappingTarget Cliente cliente);
}

