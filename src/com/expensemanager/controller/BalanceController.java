package com.expensemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BalanceController {

	@RequestMapping(value = "/balance")
	public String getBalancePage() {
		return "balance";
	}
}
