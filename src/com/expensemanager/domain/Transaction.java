package com.expensemanager.domain;

import java.util.Comparator;
import java.util.Date;

public abstract class Transaction implements Comparable<Transaction>{
	
	private double amount;
	private String tag;
	private String transactionDate;
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	@Override
	public int compareTo(Transaction o) {
		// TODO Auto-generated method stub
		return o.getTransactionDate().compareTo(this.getTransactionDate());
	}
	
	

}
