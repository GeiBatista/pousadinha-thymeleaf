package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseController {

	@RequestMapping("/hospedes/addExpense")
	public String listarBlog() {
		return "admin/add-expense";
	}
}
