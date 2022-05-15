package com.winvents.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winvents.scania.model.Caminhao;

@Repository
public interface CaminhaoRepository extends JpaRepository<Caminhao, Long>{

}
