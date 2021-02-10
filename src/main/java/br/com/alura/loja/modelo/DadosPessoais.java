package br.com.alura.loja.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DadosPessoais implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;
	
	public DadosPessoais() {
	}
	
	public DadosPessoais(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

}
