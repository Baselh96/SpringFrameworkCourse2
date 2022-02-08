package com.example.database.databasedemo;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner{
	@Autowired
	PersonJdbcDAO personJdbcDAO;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--FindAll--");
		personJdbcDAO.findAll().forEach(Item -> System.out.println(Item.toString()));
		System.out.println("--FindById--");
		System.out.println(personJdbcDAO.findById(1).toString());
		System.out.println("--FindByName--");
		System.out.println(personJdbcDAO.findByName("Asd").toString());
		System.out.println("--FindByIdAndLocation--");
		System.out.println(personJdbcDAO.findByIdAndLocation(1, "Köln").toString());
		
		System.out.println("--DeleteById--");
		System.out.println(personJdbcDAO.deleteById(2));
		personJdbcDAO.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		System.out.println("--insert--");
		System.out.println(personJdbcDAO.insert(new Person(4, "neuPerson", "newLocation", new Date())));
		personJdbcDAO.findAll().forEach(Item -> System.out.println(Item.toString()));
		
		System.out.println("--update--");
		System.out.println(personJdbcDAO.update(new Person(4, "Jusuf", "Hamburg", new Date())));
		personJdbcDAO.findAll().forEach(Item -> System.out.println(Item.toString()));
	}



}
