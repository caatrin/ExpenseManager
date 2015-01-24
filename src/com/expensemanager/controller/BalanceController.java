package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.expensemanager.service.BalanceService;

@Controller
public class BalanceController {

	@Autowired
	BalanceService balanceService;
	
	@RequestMapping(value = "/balance")
	public ModelAndView getBalancePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("balance");
		modelAndView.addObject("sumIncome", balanceService.getTotalIncome());
		modelAndView.addObject("sumExpense", balanceService.getTotalExpense());
		modelAndView.addObject("balance", balanceService.computeBalance());
		return modelAndView;
	}
	
}
