package com.expensemanager.repository;

import java.util.List;

import com.expensemanager.domain.Expense;
import com.expensemanager.domain.Income;
import com.expensemanager.domain.Transaction;

public interface TransactionRepository {
	public void save(Transaction transaction);
	public List<Transaction> getAll();		
	public List<Income> getAllIncomes();
	public List<Expense> getAllExpenses();
}
