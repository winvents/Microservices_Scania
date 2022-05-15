package com.winvents.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winvents.scania.model.Vendas;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long>{

}
