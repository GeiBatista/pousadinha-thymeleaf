package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {

	@RequestMapping("/hospedes/addRole")
	public String listarBlog() {
		return "admin/add-role";
	}
}
