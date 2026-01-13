package com.mrbatista.pousadinha.controller.elementosUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/hospedes/formBasicInput")
	public String formBasicInput() {
		return "admin/form-basic-inputs";
	}

	@RequestMapping("/hospedes/formInputGroups")
	public String formInputGroups() {
		return "admin/form-input-groups";
	}
	
	@RequestMapping("/hospedes/formHorizontal")
	public String formHorizontal() {
		return "admin/form-horizontal";
	}

	@RequestMapping("/hospedes/formVertical")
	public String formVertical() {
		return "admin/form-vertical";
	}

}
