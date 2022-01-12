package com.example.newProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.newProject.xml.XmlPersonDAO;


public class XmlContextApplication {

	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext applicationContext 
				= new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
	
		}
	}

}


