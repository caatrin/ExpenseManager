package com.expensemanager.domain;

import java.util.List;

public class Balance {
	
	private List<Transaction> transactions;
	private double sumIncomes;
	private double sumExpenses;
	
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	public double getSumIncomes() {
		return sumIncomes;
	}
	
	public double getSumExpenses() {
		return sumExpenses;
	}
	
	public void setSum(){
		for (Transaction transaction : transactions) {
			if(transaction instanceof Income){
				sumIncomes += transaction.getAmount();
			}else{
				sumExpenses += transaction.getAmount();
			}
		}
		
	}
	
	public double computeBalance() {
		setSum();
		return sumIncomes - sumExpenses;
		
	}
	

}
