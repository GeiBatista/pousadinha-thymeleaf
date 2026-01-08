package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookingController {

	@RequestMapping("/hospedes/addBooking")
	public String novo() {
		return "admin/add-booking";
	}
	
	@RequestMapping("/hospedes/allBooking")
	public String listarBlog() {
		return "admin/all-booking";
	}
}
