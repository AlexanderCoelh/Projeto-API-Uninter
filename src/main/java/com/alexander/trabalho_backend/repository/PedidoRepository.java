package com.alexander.trabalho_backend.repository;

import com.alexander.trabalho_backend.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}