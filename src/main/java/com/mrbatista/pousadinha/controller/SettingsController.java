package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettingsController {
	
	@RequestMapping("/hospedes/settings")
	private String settings() {
		return "admin/settings";
	}
	
	@RequestMapping("/hospedes/emailSettings")
	private String configuracaoEmail() {
		return "admin/email-settings";
	}
	
	@RequestMapping("/hospedes/localization")
	public String localization(){
		return "admin/localization";
	}
	
	@RequestMapping("/hospedes/notificationsSettings")
	public String notificationsSettings(){
		return "admin/notifications-settings";
	}

	@RequestMapping("/hospedes/rolesPermissions")
	public String rolesPermissions(){
		return "admin/roles-permissions";
	}

	@RequestMapping("/hospedes/salarySettings")
	public String salarySettings(){
		return "admin/salary-settings";
	}
	
	@RequestMapping("/hospedes/themeSettings")
	public String themeSettings(){
		return "admin/theme-settings";
	}

}

