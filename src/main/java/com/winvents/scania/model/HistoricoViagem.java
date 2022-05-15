package com.winvents.scania.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoricoViagem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idViagem;
	
	@Column(nullable = false, length = 100)
	private String destino;
	
	@Column
	private Instant dataSaida;
	
	@Column
	private Instant dataChegada;
	
	@Column
	private Instant horaSaida;
	
	@Column
	private Instant horaChegada;
	
	@Column(nullable = false, length = 10)
	private int duracaoViagem;
	
	@Column(nullable = false, length = 10)
	private int distanciaPercorrida;
	
	@Column(nullable = false, length = 10)
	private int quantidadeParadas;
	
	
}
