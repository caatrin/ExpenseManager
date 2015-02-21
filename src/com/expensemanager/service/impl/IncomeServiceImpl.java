package com.expensemanager.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensemanager.domain.Income;
import com.expensemanager.repository.IncomeRepository;
import com.expensemanager.repository.UserRepository;
import com.expensemanager.service.IncomeService;

@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {
	@Autowired
	private IncomeRepository incomeRepository;
	@Autowired
	private UserRepository userRepository;
	@Override
	@Transactional
	public void addIncome(Income income) {
		incomeRepository.save(income);
	}

	@Override
	public List<Income> getAllIncomes(Long userId) {
		List<Income> incomes = incomeRepository.findAllIncomes(userId);
		Collections.sort(incomes);
		return incomes;
	}

	@Override
	public void deleteIncome(Income income) {
		incomeRepository.delete(income);
	}

	@Override
	public void editIncome(Income income) {
		incomeRepository.save(income);
		
	}

	@Override
	public Income getOne(Long id) {
		return incomeRepository.findOne(id);
	}

}
