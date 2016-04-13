package com.me.test;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.me.business.Bank;
import com.me.services.LogBeforeService;

public class Test {

	public static void main(String[] args) {
		//Create Target
		Bank b = new Bank();
		
		//Create Advice
		LogBeforeService lbs = new LogBeforeService();
		
		//Add Target and Advice to Proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		
		//Get generated Proxy
		Bank bProxy = (Bank)pfb.getObject();
		int TotalAmount = bProxy.deposite("BOA123", 5000);
		System.out.println(TotalAmount);
	}

}
