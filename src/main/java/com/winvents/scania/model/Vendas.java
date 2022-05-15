package com.winvents.scania.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendas {
	
	@Id
	private Long idVenda;

	@Column
	private Instant dataVenda;
	
	@Column(nullable = false, length = 50)
	private Long valorVenda;
	
	@Column(nullable = false, length = 30)
	private Long comissao;
	
	@Column(nullable = false, length = 30)
	private String formaPagamento;
}
