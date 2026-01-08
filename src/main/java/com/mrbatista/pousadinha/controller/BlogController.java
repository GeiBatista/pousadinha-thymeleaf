package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

	@RequestMapping("/hospedes/blog")
	public String blog() {
		return "admin/blog";
	}
	
	@RequestMapping("/hospedes/addBlog")
	public String novo() {
		return "admin/add-blog";
	}
	
	@RequestMapping("/hospedes/blogDetails")
	public String details() {
		return "admin/blog-details";
	}
}
