package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HospedeController {
	
	@RequestMapping("/hospedes")
	public String novo() {
		return "hospede/CadastroHospede";
	}
}
