package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.expensemanager.domain.Income;
import com.expensemanager.domain.User;
import com.expensemanager.service.IncomeService;

@Controller
@SessionAttributes(value = {"page","validUser"})
public class IncomeController {
	@Autowired
	IncomeService incomeService;
	@RequestMapping(value="/income")
	public ModelAndView getIncomePage(Model model) {
	return initModelAndView(model);	
		
	}
	@RequestMapping(value="/income", method = RequestMethod.POST)
	public ModelAndView addIncome(Income income, Model model){
		income.setUser((User)model.asMap().get("validUser"));
		incomeService.addIncome(income);
		return initModelAndView(model);	
	}
	
	@RequestMapping(value="/income", method = RequestMethod.DELETE)
	public ModelAndView deleteIncome(Income income, Model model) {
		income.setUser((User)model.asMap().get("validUser"));
		incomeService.deleteIncome(income);
		return initModelAndView(model);	
	}
	
	public ModelAndView initModelAndView(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("income");
		Long userId = ((User)model.asMap().get("validUser")).getUserId();
		modelAndView.addObject("listOfIncomes", incomeService.getAllIncomes(userId));
		return modelAndView;
	}
}
