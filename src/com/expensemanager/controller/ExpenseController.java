package com.expensemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseController {
	
	@RequestMapping(value = "/expense")
	public String getExpensePage() {
		return "expense";
	}

}
