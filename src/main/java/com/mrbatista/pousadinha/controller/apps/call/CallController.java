package com.mrbatista.pousadinha.controller.apps.call;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CallController {
	
	@RequestMapping("/hospedes/incomingCall")
	private String incomingCall() {
		return "admin/incoming-call";
	}
	
	@RequestMapping("/hospedes/videoCall")
	private String videoCall() {
		return "admin/video-call";
	}
	
	@RequestMapping("/hospedes/voiceCall")
	private String voiceCall() {
		return "admin/voice-call";
	}

}
