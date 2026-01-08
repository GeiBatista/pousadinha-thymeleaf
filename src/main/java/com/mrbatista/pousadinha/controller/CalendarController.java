package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalendarController {
	
	@RequestMapping("/hospedes/calendar")
	private String calendar() {
		return "admin/calendar";
	}

}
