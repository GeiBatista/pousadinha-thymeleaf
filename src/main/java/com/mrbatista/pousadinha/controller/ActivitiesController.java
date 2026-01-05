package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActivitiesController {
	
	@RequestMapping("/hospedes/activities")
	public String listarAdmin(){
		return "admin/activities";
	}

}
