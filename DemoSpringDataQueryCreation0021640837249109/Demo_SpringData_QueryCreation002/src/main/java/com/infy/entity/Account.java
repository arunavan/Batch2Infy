package com.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	Integer accountId;
	
	String accountHolderName;
	Double openingBalance;
	String addofTheCustomer;
	
}
