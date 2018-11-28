package com.gplog.rastreio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gplog.rastreio.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
