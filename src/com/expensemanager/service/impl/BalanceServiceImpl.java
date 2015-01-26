package com.expensemanager.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.InitBinder;

import com.expensemanager.domain.Balance;
import com.expensemanager.domain.Income;
import com.expensemanager.domain.Transaction;
import com.expensemanager.repository.TransactionRepository;
import com.expensemanager.service.BalanceService;

@Service
public class BalanceServiceImpl implements BalanceService {
	private Long userIden;
	@Autowired
	private TransactionRepository transactionRepository;
	private Balance balance;
	

	@Override
	public void loadInitialValues(Long userId) {
		// TODO Auto-generated method stub
		balance = new Balance();
		userIden = userId;
		if (transactionRepository.getAllTransactions(userId).isEmpty()) {
			balance.setSumIncomes(0);
			balance.setSumExpenses(0);
			
		} else {
			balance.setTransactions(transactionRepository.getAllTransactions(userId));
		}	
	}
		
	@PostConstruct
	public void doSomething(){
		
	}

	@Override
		public double getTotalIncome() {
		setSum();
		return balance.getSumIncomes();
	}

	@Override
	public double getTotalExpense() {
		setSum();
		return balance.getSumExpenses();
	}

	@Override
	public double computeBalance() {
		setSum();
		return balance.getSumIncomes() - balance.getSumExpenses();
	}

	private void setSum(){		
		double sumIncomes = 0;
		double sumExpenses = 0;
		if(!transactionRepository.getAllTransactions(userIden).isEmpty()){
		for (Transaction transaction : transactionRepository.getAllTransactions(userIden)) {
			if(transaction instanceof Income){
				sumIncomes += transaction.getAmount();
			}else{
				sumExpenses += transaction.getAmount();
			}
		}
		}
		balance.setSumIncomes(sumIncomes); 
		balance.setSumExpenses(sumExpenses); 
	}

}
