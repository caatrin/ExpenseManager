package com.expensemanager.service;

import java.util.List;

import com.expensemanager.domain.Expense;

public interface ExpenseService {
	public void addExpense(Expense expense);
	public List<Expense> getAllExpenses(Long id);

}
