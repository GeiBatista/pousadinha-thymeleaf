package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginasController {
	
	@RequestMapping("/hospedes/blankPage")
	private String blank() {
		return "admin/blank-page";
	}
	
	@RequestMapping("/hospedes/changePassword")
	public String changePassword(){
		return "admin/change-password";
	}

}

