package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mrbatista.pousadinha.model.Hospede;

import jakarta.validation.Valid;

@Controller
public class HospedeController {
	
	@RequestMapping("/hospedes/novo")
	public String novo(Hospede hospede) {
		return "hospede/CadastroHospede";
	}
	
	@PostMapping("/hospedes/novo")
	public String salvar(@Valid Hospede hospede, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(hospede);
		}
		attributes.addFlashAttribute("msg", "Hóspede salvo com sucesso!.");
		System.out.println("Salvando hospede... " + hospede.getNome() + " " + hospede.getSobrenome());
		return "redirect:/hospedes/novo";
	}
}
