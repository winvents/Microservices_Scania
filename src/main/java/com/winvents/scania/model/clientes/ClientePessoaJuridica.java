package com.winvents.scania.model.clientes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientePessoaJuridica extends Cliente {

	private String cnpj;

	public ClientePessoaJuridica(Long id, String nome, String email, String telefone, String cnpj) {
		super(id, nome, email, telefone);
		this.cnpj = cnpj;
	}
	
}
