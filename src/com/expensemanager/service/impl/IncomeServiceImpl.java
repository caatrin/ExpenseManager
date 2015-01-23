package com.expensemanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemanager.domain.Income;
import com.expensemanager.repository.TransactionRepository;
import com.expensemanager.service.IncomeService;

@Service
public class IncomeServiceImpl implements IncomeService {
	@Autowired
	private TransactionRepository transactionRepository;
	@Override
	public void addIncome(Income income) {
		transactionRepository.save(income);
	}

	@Override
	public List<Income> getAllIncomes() {
		return transactionRepository.getAllIncomes();
	}

}
