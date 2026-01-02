package com.vagnernunes.designpatterns.repository;

import com.vagnernunes.designpatterns.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

