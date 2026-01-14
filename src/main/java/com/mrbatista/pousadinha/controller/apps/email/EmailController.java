package com.mrbatista.pousadinha.controller.apps.email;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
	
	@RequestMapping("/hospedes/novoEmail")
	private String novo() {
		return "admin/compose";
	}

	@RequestMapping("/hospedes/inbox")
	private String inbox() {
		return "admin/inbox";
	}

}
