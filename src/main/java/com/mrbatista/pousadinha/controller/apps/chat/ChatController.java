package com.mrbatista.pousadinha.controller.apps.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	
	@RequestMapping("/hospedes/chat")
	private String chat() {
		return "admin/chat";
	}

}
