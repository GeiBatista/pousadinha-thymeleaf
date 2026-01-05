package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeaveController {

	@RequestMapping("/hospedes/addLeave")
	public String listarLicenca() {
		return "admin/add-leave";
	}
	
	@RequestMapping("/hospedes/addLeaveType")
	public String listarTipoLicenca() {
		return "admin/add-leave-type";
	}
	
}
