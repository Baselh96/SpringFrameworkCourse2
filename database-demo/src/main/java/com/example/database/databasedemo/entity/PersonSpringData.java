package com.example.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class PersonSpringData {
	@Id
	private int id;
	private String name;
	private String Location;
	private Date birth_date;
	
	public PersonSpringData() {
	}
	
	public PersonSpringData(int id, String name, String location, Date birth_date) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
		this.birth_date = birth_date;
	}
	
	public PersonSpringData(String name, String location, Date birth_date) {
		super();
		this.name = name;
		Location = location;
		this.birth_date = birth_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" | Name: "+name+ " | Location: "+Location+ " | Bithdate: "+ birth_date;
	}
	
}
