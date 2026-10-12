package com.alexander.trabalho_backend.repository;

import com.alexander.trabalho_backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}