package com.mrbatista.pousadinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {
	
	@RequestMapping("/hospedes/invoices")
	public String invoices(){
		return "admin/invoices";
	}
	
	@RequestMapping("/hospedes/invoiceSettings")
	public String invoiceSettings(){
		return "admin/invoice-settings";
	}
	
	@RequestMapping("/hospedes/invoiceView")
	public String invoiceView(){
		return "admin/invoice-view";
	}
	
	@RequestMapping("/hospedes/invoiceReports")
	public String invoiceReports(){
		return "admin/invoice-reports";
	}

	@RequestMapping("/hospedes/createInvoice")
	public String listarAdmin(){
		return "admin/create-invoice";
	}
	
	@RequestMapping("/hospedes/editInvoice")
	public String editar(){
		return "admin/edit-invoice";
	}

}
