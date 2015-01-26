package com.expensemanager.domain;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="expensemanager")
@Inheritance
@DiscriminatorColumn(name="transType")
public abstract class Transaction implements Comparable<Transaction>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId;
	private double amount;
	private String tag;
	private String transactionDate;
	@ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.MERGE})
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
