package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/hospedes/addEmployee")
	public String listar() {
		return "admin/add-employee";
	}
	
	@RequestMapping("/hospedes/editEmployee")
	public String editar(){
		return "admin/edit-employee";
	}
	
	@RequestMapping("/hospedes/employees")
	public String employee() {
		return "admin/employees";
	}
	
	@RequestMapping("/hospedes/holidays")
	public String holidays() {
		return "admin/holidays";
	}
}
