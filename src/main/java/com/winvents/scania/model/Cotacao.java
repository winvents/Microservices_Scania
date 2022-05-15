package com.winvents.scania.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cotacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCotacao;
	
	@Column(nullable = false)
	private Instant dataCotacao;
	
	@Column(length = 15, nullable = false)
	private String status;
	
}
