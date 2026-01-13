package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssetController {
	
	@RequestMapping("/hospedes/assets")
	public String asset(){
		return "admin/assets";
	}
	
	@RequestMapping("/hospedes/addAssets")
	public String novo(){
		return "admin/add-assets";
	}

	@RequestMapping("/hospedes/editAsset")
	public String editar(){
		return "admin/edit-asset";
	}

}
