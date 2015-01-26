package com.expensemanager.service;

public interface BalanceService {
	public void loadInitialValues(Long userId);
	public double getTotalIncome();
	public double getTotalExpense();
	public double computeBalance();

}
