package com.winvents.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winvents.scania.model.HistoricoViagem;

@Repository
public interface HistoricoViagemRepository extends JpaRepository<HistoricoViagem, Long> {

}
