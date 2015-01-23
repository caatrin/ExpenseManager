package com.expensemanager.service;

import java.util.List;

import com.expensemanager.domain.Income;

public interface IncomeService {
	public void addIncome(Income income);
	public List<Income> getAllIncomes();	
}
