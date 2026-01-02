package com.vagnernunes.designpatterns.service;

import com.vagnernunes.designpatterns.dto.ClienteDTO;
import com.vagnernunes.designpatterns.dto.ClienteCreateDTO;
import com.vagnernunes.designpatterns.dto.ClienteUpdateDTO;
import com.vagnernunes.designpatterns.entity.Cliente;
import com.vagnernunes.designpatterns.repository.ClienteRepository;
import com.vagnernunes.designpatterns.mapper.ClienteMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository repository;
    private final ClienteMapper mapper;

    public ClienteService(ClienteRepository repository, ClienteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    public ClienteDTO criarCliente(ClienteCreateDTO dto) {
        Cliente cliente = mapper.fromCreateDTO(dto);
        return mapper.toDTO(repository.save(cliente));
    }

    public ClienteDTO buscarCliente(Long id) {
        Cliente cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        return mapper.toDTO(cliente);
    }

    public List<ClienteDTO> listarClientes() {
        return mapper.toDTOList(repository.findAll());
    }

    @Transactional
    public ClienteDTO atualizarCliente(Long id, ClienteUpdateDTO dto) {
        Cliente cliente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        mapper.updateFromDTO(dto, cliente);
        return mapper.toDTO(repository.save(cliente));
    }

    @Transactional
    public void deletarCliente(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Cliente não encontrado");
        }
        repository.deleteById(id);
    }
}
