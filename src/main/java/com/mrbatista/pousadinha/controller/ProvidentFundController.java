package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProvidentFundController {

	@RequestMapping("/hospedes/addProvidentFund")
	public String listarBlog() {
		return "admin/add-provident-fund";
	}
}
