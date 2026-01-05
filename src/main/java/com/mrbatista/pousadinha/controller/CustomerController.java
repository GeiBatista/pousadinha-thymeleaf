package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("/hospedes/addCustomer")
	public String listarBlog() {
		return "admin/add-customer";
	}
}
