package com.example.database.databasedemo;




import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.databasedemo.entity.PersonSpringData;
import com.example.database.databasedemo.springData.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner{
	@Autowired
	PersonSpringDataRepository personSpringDataRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--insert--");
		personSpringDataRepository.save(new PersonSpringData(1, "Basel", "Koeln", new Date()));
		personSpringDataRepository.save(new PersonSpringData(2, "Hussein", "Syrien", new Date()));
		personSpringDataRepository.save(new PersonSpringData(3, "Asd", "Dänimark", new Date()));
		personSpringDataRepository.save(new PersonSpringData(4, "Eva", "Holland", new Date()));
		personSpringDataRepository.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		System.out.println("--update--");
		System.out.println(personSpringDataRepository.save(new PersonSpringData(3,"Asd", "newLocation", new Date())));
		personSpringDataRepository.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		System.out.println("--deleteById--");
		personSpringDataRepository.deleteById(2);
		personSpringDataRepository.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		System.out.println("--FindAll--");
		personSpringDataRepository.findAll().forEach(Item -> System.out.println(Item.toString()));

		System.out.println("--FindById--");
		System.out.println(personSpringDataRepository.findById(1));
	}



}
