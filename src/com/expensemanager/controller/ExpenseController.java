package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.expensemanager.domain.Expense;
import com.expensemanager.service.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	@RequestMapping(value = "/expense")
	public ModelAndView getExpensePage() {
		return initModelAndView();
	}
	
	@RequestMapping(value = "/expense", method = RequestMethod.POST)
	public ModelAndView addExpense(Expense expense) {
		expenseService.addExpense(expense);
		return initModelAndView();
	}
	
	public ModelAndView initModelAndView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("expense");
		modelAndView.addObject("listOfExpenses", expenseService.getAllExpenses());
		return modelAndView;
		
	}

}
