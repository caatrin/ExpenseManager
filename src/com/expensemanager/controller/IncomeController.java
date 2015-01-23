package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.expensemanager.domain.Income;
import com.expensemanager.service.IncomeService;

@Controller
public class IncomeController {
	@Autowired
	IncomeService incomeService;
	@RequestMapping(value="/income")
	public String getIncomePage() {
		return "income";
	}
	@RequestMapping(value="/income", method = RequestMethod.POST)
	public ModelAndView addIncome(Income income){
		System.out.println("Hello");
		incomeService.addIncome(income);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("income");
		modelAndView.addObject("listOfIncomes", incomeService.getAllIncomes());
		return modelAndView;
	}
}
