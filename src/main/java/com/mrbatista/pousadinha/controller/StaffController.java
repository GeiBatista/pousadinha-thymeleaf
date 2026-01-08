package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaffController {
	
	@RequestMapping("/hospedes/addStaff")
	public String novo(){
		return "admin/add-staff";
	}
	@RequestMapping("/hospedes/allStaff")
	public String listarStaff(){
		return "admin/all-staff";
	}

}
