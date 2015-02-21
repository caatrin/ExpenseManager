package com.expensemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.expensemanager.domain.Expense;
import com.expensemanager.domain.User;
import com.expensemanager.service.ExpenseService;

@Controller
@SessionAttributes(value = {"page","validUser"})
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	@RequestMapping(value = "/expense")
	public ModelAndView getExpensePage(Model model) {
		return initModelAndView(model);
	}
	
	@RequestMapping(value = "/expense", method = RequestMethod.POST)
	public String addExpense(Expense expense, Model model) {
		expense.setUser((User)model.asMap().get("validUser"));
		expenseService.addExpense(expense);
		return "redirect:/expense";
	}
	
	@RequestMapping(value= "/deleteExpense", method = RequestMethod.GET)
	public ModelAndView deleteExpense(@RequestParam Long id, Model model) {
		expenseService.deleteExpense(expenseService.getOne(id));
		return initModelAndView(model);
	}
	
	public ModelAndView initModelAndView(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("expense");
		Long userId = ((User)model.asMap().get("validUser")).getUserId();
		modelAndView.addObject("listOfExpenses", expenseService.getAllExpenses(userId));
		System.out.println("id: " + expenseService.getAllExpenses(userId).get(0).getTransactionId());
		return modelAndView;
		
	}

}
