package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssetController {
	
	@RequestMapping("/hospedes/asset")
	public String listarAdmin(){
		return "admin/add-asset";
	}

}
