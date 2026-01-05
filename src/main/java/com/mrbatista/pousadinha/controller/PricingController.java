package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PricingController {

	@RequestMapping("/hospedes/addPricing")
	public String listarBlog() {
		return "admin/add-pricing";
	}
}
