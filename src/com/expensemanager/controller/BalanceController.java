package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.expensemanager.domain.User;
import com.expensemanager.service.BalanceService;

@Controller
@SessionAttributes(value = {"page", "validUser"})
public class BalanceController {

	@Autowired
	BalanceService balanceService;
	
	@RequestMapping(value = "/balance")
	public ModelAndView getBalancePage(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("balance");
		Long userId = ((User)model.asMap().get("validUser")).getUserId();
		balanceService.loadInitialValues(userId);
		modelAndView.addObject("sumIncome", balanceService.getTotalIncome());
		modelAndView.addObject("sumExpense", balanceService.getTotalExpense());
		modelAndView.addObject("balance", balanceService.computeBalance());
		return modelAndView;
	}
	
}
