package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalaryController {
	
	@RequestMapping("/hospedes/addSalary")
	public String listarSalary(){
		return "admin/add-salary";
	}

	@RequestMapping("/hospedes/editSalary")
	public String editar(){
		return "admin/edit-salary";
	}

}
