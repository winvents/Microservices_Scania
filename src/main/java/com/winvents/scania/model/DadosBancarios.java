package com.winvents.scania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DadosBancarios {

	@Id
	private int id_banco;
	
	@Column(nullable = false)
	private int agencia;
	
	@Column(length = 30, nullable = false)
	private String conta;
	
}
