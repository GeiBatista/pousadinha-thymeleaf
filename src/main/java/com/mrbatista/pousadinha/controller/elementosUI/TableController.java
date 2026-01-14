package com.mrbatista.pousadinha.controller.elementosUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {
	
	@RequestMapping("/hospedes/tableBasic")
	public String tableBasic() {
		return "admin/tables-basic";
	}
	
	@RequestMapping("/hospedes/tableDatatable")
	public String tableDatatable() {
		return "admin/tables-datatables";
	}

}
