package com.winvents.scania.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Caminhao {
	
	@Id
	private int chassi;
	
	@Column(length = 50, nullable = false)
	private String tipo_chassi;
	
	@Column(name = "modelo", length = 50, nullable = false)
	private String modeloCaminhao;
	
	@Column(name = "data_fabricacao", nullable = false)
	private Instant dataFabricacao;
	
	@Column(length = 10, nullable = false)
	private String placa;
	
	@Column(length = 20, nullable = false)
	private String zonaOperacao;
	
	@Column(length = 30, nullable = false)
	private String aplicacaoUtilidade;
	
	@Column(length = 30, nullable = false)
	private String eixo;
	
	@Column(length = 30, nullable = false)
	private String cor;
	
	@Column(length = 15, nullable = false)
	private String cabine;
	
	@Column(length = 10, nullable = false)
	private String alturaCabine;

	@Column(length = 30, nullable = false)
	private String combustivel;
	
	@Column(length = 30, nullable = false)
	private String tipoCarga;
	
	@Column(length = 50, nullable = false)
	private Long cargaMaxima;
	
	@Column
	private int quilometragem;
	
	@Column(name = "velocidade")
	private int velocidadeMaxima;
	
	@Column
	private Long preco;

}