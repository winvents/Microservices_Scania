package com.winvents.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.winvents.scania.model.clientes.Cliente;

@NoRepositoryBean
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
