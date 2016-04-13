package com.me.business;

public class Bank {
	private int amount=5000;
	private String accNumber = "BOA123";
	
	public int deposite(String accNumber, int amount){
		if(accNumber.equals(this.accNumber)){
			this.amount=this.amount+amount;
			return this.amount;
		}
		else{
			throw new AccountNumberNotFoundException();
		}
	}
}
