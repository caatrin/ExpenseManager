package com.expensemanager.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemanager.domain.Expense;
import com.expensemanager.repository.ExpenseRepository;
import com.expensemanager.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Override
	public void addExpense(Expense expense) {
		expenseRepository.save(expense);
		
	}

	@Override
	public List<Expense> getAllExpenses(Long id) {
		List<Expense> expenses = expenseRepository.findAllExpenses(id);
		Collections.sort(expenses);
		return expenses;
	}

}
