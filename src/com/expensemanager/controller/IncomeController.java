package com.expensemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncomeController {

	@RequestMapping(value="/income")
	public String getIncomePage() {
		return "income";
	}
}
