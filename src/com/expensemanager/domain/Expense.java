package com.expensemanager.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "expensemanager")
@DiscriminatorValue("Expense")
public class Expense extends Transaction {

}
