package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// Hierbei können wir die Zeit für das Ausführen der Methode messen. Also diese Annotation 
	// erlaubt uns etwas vor und etwas nach dem Ausführen der Methode zu machen
	@Around(value="execution(* com.example.spring.aop.springaop.business.Business2.*(..))")
	public void afterReturning(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		//vor Aufruf
		proceedingJoinPoint.proceed();
		//nach Aufruf
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by {} is {}", proceedingJoinPoint, timeTaken);
	}
}
