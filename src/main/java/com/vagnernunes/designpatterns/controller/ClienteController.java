package com.vagnernunes.designpatterns.controller;

import com.vagnernunes.designpatterns.dto.ClienteDTO;
import com.vagnernunes.designpatterns.dto.ClienteCreateDTO;
import com.vagnernunes.designpatterns.dto.ClienteUpdateDTO;
import com.vagnernunes.designpatterns.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> criar(@RequestBody ClienteCreateDTO dto) {
        ClienteDTO cliente = service.criarCliente(dto);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @GetMapping
    public List<ClienteDTO> listar() {
        return service.listarClientes();
    }

    @GetMapping("/{id}")
    public ClienteDTO buscar(@PathVariable Long id) {
        return service.buscarCliente(id);
    }

    @PutMapping("/{id}")
    public ClienteDTO atualizar(@PathVariable Long id, @RequestBody ClienteUpdateDTO dto) {
        return service.atualizarCliente(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        service.deletarCliente(id);
    }
}
