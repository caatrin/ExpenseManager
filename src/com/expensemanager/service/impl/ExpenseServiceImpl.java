package com.expensemanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemanager.domain.Expense;
import com.expensemanager.repository.TransactionRepository;
import com.expensemanager.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public void addExpense(Expense expense) {
		transactionRepository.save(expense);
		
	}

	@Override
	public List<Expense> getAllExpenses() {
		return transactionRepository.getAllExpenses();
	}

}
