package com.expensemanager.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	@Override
	public int compareTo(Transaction o) {
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		Date oldDate=new Date();
		Date newDate=new Date();
		try {
			oldDate = sdf.parse(this.getTransactionDate());
			newDate = sdf.parse(o.getTransactionDate());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return newDate.compareTo(oldDate);
	}
	
	

}
