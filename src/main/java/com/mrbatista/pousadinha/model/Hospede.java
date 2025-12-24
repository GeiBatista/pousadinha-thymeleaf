package com.mrbatista.pousadinha.model;

import jakarta.validation.constraints.NotBlank;

public class Hospede {
	
	@NotBlank(message = "O nome é obrigatório.")
	private String nome;
	
	@NotBlank(message = "O sobrenome é obrigatório.")
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
