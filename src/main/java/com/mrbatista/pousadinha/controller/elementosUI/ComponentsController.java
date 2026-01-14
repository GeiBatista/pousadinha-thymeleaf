package com.mrbatista.pousadinha.controller.elementosUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComponentsController {
	
	@RequestMapping("/hospedes/tabs")
	public String tabs() {
		return "admin/tabs";
	}

	@RequestMapping("/hospedes/typography")
	public String typography() {
		return "admin/typography";
	}
	
	@RequestMapping("/hospedes/uikit")
	public String uikit() {
		return "admin/uikit";
	}

}
