package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettingsController {
	
	@RequestMapping("/hospedes/emailSettings")
	private String configuracaoEmail() {
		return "admin/email-settings";
	}
	
	@RequestMapping("/hospedes/localization")
	public String localization(){
		return "admin/localization";
	}
	
//	@RequestMapping("/hospedes/editProfile")
//	public String editarProfile(){
//		return "admin/edit-profile";
//	}

}

