package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/hospedes/addEmployee")
	public String listarBlog() {
		return "admin/add-employee";
	}
}
