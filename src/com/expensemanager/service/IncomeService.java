package com.expensemanager.service;

import java.util.List;

import com.expensemanager.domain.Income;

public interface IncomeService {
	public void addIncome(Income income);
	public void deleteIncome(Income income);
	public void editIncome(Income income);
	public List<Income> getAllIncomes(Long userId);	
	public Income getOne(Long id);
}
