package com.mrbatista.pousadinha.model;

import jakarta.validation.constraints.NotBlank;

public class Hospede {
	
	@NotBlank
	private String nome;
	
	@NotBlank
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
