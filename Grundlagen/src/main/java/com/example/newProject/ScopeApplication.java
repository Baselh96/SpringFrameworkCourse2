package com.example.newProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.newProject.BeanScpoe.PersonDAO;


@Configuration
@ComponentScan
public class ScopeApplication {
	
	private static Logger logger = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		
		try( AnnotationConfigApplicationContext applicationContext 
				= new AnnotationConfigApplicationContext(ScopeApplication.class)){
			PersonDAO peron = applicationContext.getBean(PersonDAO.class);
			
			PersonDAO peron2 = applicationContext.getBean(PersonDAO.class);

			logger.info("Peron: {}", peron);
			logger.info("Peron: {}", peron.getJdbcConnection());

			logger.info("Peron2: {}", peron2);
			logger.info("Peron2: {}", peron2.getJdbcConnection());
		}
	}

}
