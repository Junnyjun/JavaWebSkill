package com.spring.ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before : LogginAdvice");
		System.out.println(invocation.getMethod());

		Object object = invocation.proceed();

		System.out.println("after : loggingAdvice");
		System.out.println(invocation.getMethod());
		return object;
	}
}
