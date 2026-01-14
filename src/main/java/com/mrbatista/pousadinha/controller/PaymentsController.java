package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentsController {
	
	@RequestMapping("/hospedes/payments")
	public String payments(){
		return "admin/payments";
	}
			
}
