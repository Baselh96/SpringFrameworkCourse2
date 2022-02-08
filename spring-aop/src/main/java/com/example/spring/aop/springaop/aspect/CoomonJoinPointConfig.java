package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CoomonJoinPointConfig {
	
	// Wenn wir einen Pointcut mehrmals verwenden, dann können wir es hier definieren
	// und den Path für diese Methode in der passende Stelle schreiben.
	@Pointcut("execution(* com.example.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.example.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("com.example.spring.aop.springaop.aspect.CoomonJoinPointConfig.dataLayerExecution() &&"
			+ "com.example.spring.aop.springaop.aspect.CoomonJoinPointConfig.businessLayerExecution()")
	public void anyLayerExecution() {}
	
	// Für alle Beans, die mit dao als Wort starten
	@Pointcut("bean(dao*)")
	public void beanStartingDao() {}
	
	// Für alle Beans, die dao als Wort in sich haben
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	
	// Für alle Beans, die dao als Wort in sich haben
	@Pointcut("annotation(com.example.spring.aop.springaop.aspect.TrackTime)")
	public void timeTackAnnotation() {}
	
	
}
