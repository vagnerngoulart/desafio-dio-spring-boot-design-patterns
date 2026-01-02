package com.vagnernunes.designpatterns.mapper;

import com.vagnernunes.designpatterns.dto.ClienteCreateDTO;
import com.vagnernunes.designpatterns.dto.ClienteDTO;
import com.vagnernunes.designpatterns.dto.ClienteUpdateDTO;
import com.vagnernunes.designpatterns.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-02T16:51:48-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Amazon.com Inc.)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO toDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId( cliente.getId() );
        clienteDTO.setNome( cliente.getNome() );
        clienteDTO.setEmail( cliente.getEmail() );
        clienteDTO.setTelefone( cliente.getTelefone() );
        clienteDTO.setEndereco( cliente.getEndereco() );

        return clienteDTO;
    }

    @Override
    public List<ClienteDTO> toDTOList(List<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( clientes.size() );
        for ( Cliente cliente : clientes ) {
            list.add( toDTO( cliente ) );
        }

        return list;
    }

    @Override
    public Cliente fromCreateDTO(ClienteCreateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setNome( dto.getNome() );
        cliente.setEmail( dto.getEmail() );
        cliente.setTelefone( dto.getTelefone() );
        cliente.setEndereco( dto.getEndereco() );

        return cliente;
    }

    @Override
    public void updateFromDTO(ClienteUpdateDTO dto, Cliente cliente) {
        if ( dto == null ) {
            return;
        }

        cliente.setNome( dto.getNome() );
        cliente.setEmail( dto.getEmail() );
        cliente.setTelefone( dto.getTelefone() );
        cliente.setEndereco( dto.getEndereco() );
    }
}
