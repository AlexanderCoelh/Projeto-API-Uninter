package com.alexander.trabalho_backend.repository;

import com.alexander.trabalho_backend.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}