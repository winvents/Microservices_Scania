package com.winvents.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winvents.scania.model.clientes.Cliente;

@Repository
public interface ClientePessoaFisicaRepository extends JpaRepository<Cliente, Long> {

}
