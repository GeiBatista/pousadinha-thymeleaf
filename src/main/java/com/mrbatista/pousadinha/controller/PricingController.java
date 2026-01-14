package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PricingController {

	@RequestMapping("/hospedes/pricing")
	public String pricing() {
		return "admin/pricing";
	}

	@RequestMapping("/hospedes/addPricing")
	public String listarBlog() {
		return "admin/add-pricing";
	}
	
	@RequestMapping("/hospedes/editPricing")
	public String editar(){
		return "admin/edit-pricing";
	}
}
