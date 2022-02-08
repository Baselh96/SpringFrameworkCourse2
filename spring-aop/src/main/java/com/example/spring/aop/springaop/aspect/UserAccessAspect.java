package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Konfiguration
@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//Welche Methodenanrufe sollen abgefangen werden 
	//1. Pintcut-Form "execution(* Package.*.*(..))", Damit wird diese Methode vor der 
	//   Aufruf jeder Methode aus dem Package aufgerufen.
	//2. zweites * bedeutet, für jede Klasse aus dem Package
	//	 drittes * bedeutet, für jede Methode aus der Klasse bzw. Klassen
	//	 (..) bedeutet, für jedes Argument, welche in diese Methode kommt.
	//	 erstes * bedeutet, dass der Rückgabe egal ist, also alles sein kann.
	//3. Pintcut-Form "execution(* com.example.spring.aop.springaop..*.*(..))", damit 
	//   wird diese Methode vor dem Aufruf jeder Methode auch aus den Unterpackages aufgerufen.
	//4. mit einem Objekt vom Typ Joinpoint als Parameter kann man genau sehen,
	//   was aufgerufen wurde.
	//5. Avice + Ponitcut ist Aspect, also Aspect ist eine Kombination von 
	//   Pointcut und Advice
	//6. Der Prozess, der es macht wird als weaving genannt und das Framework als weaver
	
	@Before("execution(* com.example.spring.aop.springaop.data.*.*(..))")
	public void befor(JoinPoint joinpoint) {
		//Advice
		//Was muss gemacht werden
		logger.info("Beispiel: überprüfe, ob der User Recht auf den Aufruf einer diese Methode hat");
		logger.info("Ausführen für folgende Mthode erlaubt: {}", joinpoint);
	}

}
