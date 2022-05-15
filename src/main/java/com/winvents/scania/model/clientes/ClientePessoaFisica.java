package com.winvents.scania.model.clientes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientePessoaFisica extends Cliente {

	private String cpf;

	public ClientePessoaFisica(Long id, String nome, String email, String telefone, String cpf) {
		super(id, nome, email, telefone);
		this.cpf = cpf;
	}
	
	
	
	
	
}
