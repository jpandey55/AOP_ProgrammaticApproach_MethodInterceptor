package com.me.services;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.me.business.Bank;

public class LogAroundService implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
	//can use mi object for any operations
		System.out.println(mi.getMethod());
		System.out.println(mi.getThis().getClass());
		Log l = LogFactory.getLog(Bank.class);
		l.info("Executing Service before Deposite Method");
		Object ret = mi.proceed();
		l.info("Executing Service after Deposite Method");

		return ret;
	}
}
