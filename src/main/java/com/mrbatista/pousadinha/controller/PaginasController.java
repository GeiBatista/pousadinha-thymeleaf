package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginasController {
	
	@RequestMapping("/hospedes/blankPage")
	private String blank() {
		return "admin/blank-page"; 
	}
	
	@RequestMapping("/hospedes/error404")
	public String error404(){
		return "admin/error-404";
	}
	
	@RequestMapping("/hospedes/error500")
	public String error500(){
		return "admin/error-500";
	}
	
	@RequestMapping("/hospedes/gallery")
	public String gallery(){
		return "admin/gallery";
	}
	
	@RequestMapping("/hospedes/changePassword")
	public String changePassword(){
		return "admin/change-password";
	}
	
	@RequestMapping("/hospedes/forgotPassword")
	public String forgotPassword(){
		return "admin/forgot-password";
	}	
	
	@RequestMapping("/hospedes/editProfile")
	public String editarProfile(){
		return "admin/edit-profile";
	}
	
	

}

