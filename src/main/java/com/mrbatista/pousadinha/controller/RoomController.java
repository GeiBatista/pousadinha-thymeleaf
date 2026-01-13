package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomController {

	@RequestMapping("/hospedes/addRoom")
	public String novo() {
		return "admin/add-room";
	}

	@RequestMapping("/hospedes/allRooms")
	public String listarRoom() {
		return "admin/all-rooms";
	}
	
	@RequestMapping("/hospedes/editRoom")
	public String editar(){
		return "admin/edit-room";
	}
}
