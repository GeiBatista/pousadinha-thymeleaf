package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseController {

	
	@RequestMapping("/hospedes/expenses")
	public String expenses(){
		return "admin/expenses";
	}
	
	@RequestMapping("/hospedes/addExpense")
	public String listarBlog() {
		return "admin/add-expense";
	}
	
	@RequestMapping("/hospedes/editExpense")
	public String editar(){
		return "admin/edit-expense";
	}
	
	@RequestMapping("/hospedes/expenseReports")
	public String reports(){
		return "admin/expense-reports";
	}
	
	
}
