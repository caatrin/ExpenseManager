package com.expensemanager.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.expensemanager.domain.Expense;
import com.expensemanager.domain.Income;
import com.expensemanager.domain.Transaction;
import com.expensemanager.repository.TransactionRepository;

@Repository
public class TransactionRepositoryInMemoryImpl implements TransactionRepository{
	
	private List<Transaction> listOfTransactions = new ArrayList<>();	

	@Override
	public void save(Transaction transaction) {
		// TODO Auto-generated method stub
		listOfTransactions.add(transaction);
	}

	@Override
	public List<Transaction> getAll() {
		// TODO Auto-generated method stub
		return listOfTransactions;
	}

	@Override
	public List<Income> getAllIncomes() {
		List<Income> incomes = new ArrayList<>();
		for (Transaction transaction : listOfTransactions) {
			if(transaction instanceof Income){
				incomes.add((Income)transaction);
			}
		}
		return incomes;
	}

	@Override
	public List<Expense> getAllExpenses() {
		List<Expense> expenses = new ArrayList<>();
		for (Transaction transaction : listOfTransactions) {
			if(transaction instanceof Expense){
				expenses.add((Expense)transaction);
			}
		}
		return expenses;
	}
	
}
