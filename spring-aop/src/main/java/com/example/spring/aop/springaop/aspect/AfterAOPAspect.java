package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AfterAOPAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// Hierbei haben wir den Zugriff auf den Rückgabe der Methode
	@AfterReturning(
			value="execution(* com.example.spring.aop.springaop.business.Business1.*(..))",
			returning = "result")
	public void afterReturning(JoinPoint joinpoint, Object result) {
		//Advice
		//Was muss gemacht werden
		logger.info("AfterReturning: {} returned with value {}", joinpoint, result);
	}
	
	@After(value="execution(* com.example.spring.aop.springaop.business.Business1.*(..))")
	public void after(JoinPoint joinpoint) {
		//Advice
		//Was muss gemacht werden
		logger.info("After Execution {}", joinpoint);
	}
	
	@AfterThrowing(
			value="execution(* com.example.spring.aop.springaop.business.Business1.*(..))",
			throwing = "exception")
	public void afterThrowing(JoinPoint joinpoint, Object exception) {
		//Advice
		//Was muss gemacht werden
		logger.info("{} returned with value {}", joinpoint, exception);
	}
}
