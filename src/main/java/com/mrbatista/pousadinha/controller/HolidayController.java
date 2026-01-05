package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolidayController {

	@RequestMapping("/hospedes/addHoliday")
	public String listarBlog() {
		return "admin/add-holiday";
	}
}
