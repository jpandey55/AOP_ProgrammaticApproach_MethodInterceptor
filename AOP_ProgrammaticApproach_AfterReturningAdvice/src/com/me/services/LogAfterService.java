package com.me.services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import com.me.business.Bank;

public class LogAfterService implements AfterReturningAdvice {


	@Override
	public void afterReturning(Object o1, Method m, Object[] param, Object o2) throws Throwable {
		// TODO Auto-generated method stub
//		System.out.println("=--"+m.getName());
//		System.out.println(o1.toString());
//		System.out.println(o2.toString());
//		System.out.println(param);
		Log l = LogFactory.getLog(Bank.class);
		l.info("Executing Service After Deposite Method");
	}
}
