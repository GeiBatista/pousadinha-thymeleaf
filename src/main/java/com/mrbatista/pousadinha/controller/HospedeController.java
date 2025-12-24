package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mrbatista.pousadinha.model.Hospede;

@Controller
public class HospedeController {
	
	@RequestMapping("/hospedes/novo")
	public String novo() {
		return "hospede/CadastroHospede";
	}
	
	@PostMapping("/hospedes/novo")
	public String salvar(Hospede hospede) {
		System.out.println("Salvando hospede... " + hospede.getNome() + " " + hospede.getSobrenome());
		return "hospede/CadastroHospede";
	}
}
