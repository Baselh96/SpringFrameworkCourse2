package com.example.newProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.newProject.cdi.SomeCDIBusiness;


@Configuration
@ComponentScan
public class CDIApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext 
				= new AnnotationConfigApplicationContext(CDIApplication.class)) {
			
			SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
			System.out.println(someCDIBusiness);
			System.out.println(someCDIBusiness.getSomeCDIDAO());
		}

	}

}


