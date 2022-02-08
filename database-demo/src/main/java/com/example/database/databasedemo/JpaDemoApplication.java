package com.example.database.databasedemo;




import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.databasedemo.entity.PersonJpa;
import com.example.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{
	@Autowired
	PersonJpaRepository personJpaRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--FindAll--");
		personJpaRepository.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		
		System.out.println("--FindById--");
		System.out.println(personJpaRepository.findById(10));
		
		
		System.out.println("--insert--");
		System.out.println(personJpaRepository.insert(new PersonJpa(2,"neuPerson", "newLocation", new Date())));
		personJpaRepository.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		System.out.println("--update--");
		System.out.println(personJpaRepository.update(new PersonJpa(1,"UpdatePerson", "newLocation", new Date())));
		personJpaRepository.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		
		System.out.println("--deleteById--");
		personJpaRepository.deleteById(1);
		personJpaRepository.findAll().forEach(Item -> System.out.println(Item.toString()));
	}



}
