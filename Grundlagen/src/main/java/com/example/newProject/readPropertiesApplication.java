package com.example.newProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.newProject.properties.SomeExternalService;



@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class readPropertiesApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext 
				= new AnnotationConfigApplicationContext(readPropertiesApplication.class)) {
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			System.out.println(someExternalService.returnServiceURL());
		}
	}

}

