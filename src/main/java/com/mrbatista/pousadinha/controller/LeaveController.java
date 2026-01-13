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
	
	@RequestMapping("/hospedes/editLeave")
	public String editar(){
		return "admin/edit-leave";
	}
	
	@RequestMapping("/hospedes/editLeaveType")
	public String editarType(){
		return "admin/edit-leave-type";
	}
}
