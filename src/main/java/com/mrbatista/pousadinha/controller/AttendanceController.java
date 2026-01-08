package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AttendanceController {
	
	@RequestMapping("/hospedes/attendance")
	public String asset(){
		return "admin/attendance";
	}

}
