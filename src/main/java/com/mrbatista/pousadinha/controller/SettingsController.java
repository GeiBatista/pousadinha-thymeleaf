package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettingsController {
	
	@RequestMapping("/hospedes/emailSettings")
	private String configuracaoEmail() {
		return "admin/email-settings";
	}
	
//	@RequestMapping("/hospedes/changePassword")
//	public String changePassword(){
//		return "admin/change-password";
//	}
//	
//	@RequestMapping("/hospedes/editProfile")
//	public String editarProfile(){
//		return "admin/edit-profile";
//	}

}

