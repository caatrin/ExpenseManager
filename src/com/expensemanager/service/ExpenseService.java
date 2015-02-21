package com.expensemanager.service;

import java.util.List;

import com.expensemanager.domain.Expense;

public interface ExpenseService {
	public void addExpense(Expense expense);
	public void deleteExpense(Expense expense);
	public void editExpense(Expense expense);
	public List<Expense> getAllExpenses(Long id);
	public Expense getOne(Long id);

}
