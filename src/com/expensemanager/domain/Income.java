package com.expensemanager.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "expensemanager")
@DiscriminatorValue("Income")
public class Income extends Transaction {
	
	
	
	

}
