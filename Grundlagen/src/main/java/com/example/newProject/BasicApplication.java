package com.example.newProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.newProject.basic.BinarySearchImpI;



@Configuration
@ComponentScan
public class BasicApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext 
				= new AnnotationConfigApplicationContext(BasicApplication.class)) {
			BinarySearchImpI binarySearchImpI = applicationContext.getBean(BinarySearchImpI.class);
			BinarySearchImpI binarySearchImpI2 = applicationContext.getBean(BinarySearchImpI.class);
			System.out.println(binarySearchImpI);
			System.out.println(binarySearchImpI2);
	
			Integer[] arr = {1,2,3,4,5,6,7};
			System.out.println(binarySearchImpI2.binarySearch(arr, 20));
		}
	}

}

