package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mrbatista.pousadinha.model.Hospede;

import jakarta.validation.Valid;

@Controller
public class HospedeController {
	
	@RequestMapping("/hospedes/novo")
	public String novo() {
		return "hospede/CadastroHospede";
	}
	
	@PostMapping("/hospedes/novo")
	public String salvar(@Valid Hospede hospede, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Erros de validacao ao salvar hospede.");
//			return "hospede/CadastroHospede";
		}
		System.out.println("Salvando hospede... " + hospede.getNome() + " " + hospede.getSobrenome());
		return "hospede/CadastroHospede";
	}
}
