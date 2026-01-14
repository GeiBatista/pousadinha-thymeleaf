package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaxController {
	
	@RequestMapping("/hospedes/taxes")
	public String taxes(){
		return "admin/taxes";
	}

	@RequestMapping("/hospedes/addTax")
	public String listarTax(){
		return "admin/add-tax";
	}

	@RequestMapping("/hospedes/editTax")
	public String editar(){
		return "admin/edit-tax";
	}
}
