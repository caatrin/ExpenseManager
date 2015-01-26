package com.expensemanager.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensemanager.domain.Income;
import com.expensemanager.domain.User;
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
		User user = userRepository.findOne(income.getUser().getUserId());
		income.setUser(user);
		incomeRepository.save(income);
	}

	@Override
	public List<Income> getAllIncomes(Long userId) {
		List<Income> incomes = incomeRepository.findAllIncomes(userId);
		Collections.sort(incomes);
		return incomes;
	}

}
