package com.me.business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {
	private int amount=5000;
	private String accNumber = "BOA123";
	
	public int deposite(String accNumber, int amount){
		if(accNumber.equals(this.accNumber)){
			System.out.println("In Deposite Method");
			this.amount=this.amount+amount;
			return this.amount;
		}
		else{
			throw new AccountNumberNotFoundException();
		}
	}
}
