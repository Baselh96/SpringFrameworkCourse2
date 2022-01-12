package com.example.newProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.componentScan.ComponentDAO;




@Configuration
@ComponentScan("com.example.componentScan")
public class ComponentApplication {
	
	private static Logger logger = LoggerFactory.getLogger(ComponentApplication.class);

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext 
				= new AnnotationConfigApplicationContext(ComponentApplication.class)) {
			ComponentDAO component = applicationContext.getBean(ComponentDAO.class);
			
			logger.info("component: {}", component);
		}
	}

}
