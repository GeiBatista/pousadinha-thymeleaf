package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {
	
	@RequestMapping("/hospedes/createInvoice")
	public String listarAdmin(){
		return "admin/create-invoice";
	}

}
