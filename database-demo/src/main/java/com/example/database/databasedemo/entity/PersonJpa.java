package com.example.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
//@Table(name="person") // das brauchen wir nicht weil in diesem Fall der 
					  // genau heißt wie die Tabelle
@NamedQuery(name="find_all_persons", query = "select p from PersonJpa p")
public class PersonJpa {
	@Id // es bezeicht diese Attribut als Primary Key
	@GeneratedValue // dadurch wird automatisch die id ausgefüllt. es ist wie eine Sequenze
	private int id;
	
	//@Column(name = "name") // Das brauchen wir auch hier nicht, weil die Spalte genauso heißt
	private String name;
	private String Location;
	private Date birth_date;
	
	public PersonJpa() {
	}
	
	public PersonJpa(int id, String name, String location, Date birth_date) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
		this.birth_date = birth_date;
	}
	
	public PersonJpa(String name, String location, Date birth_date) {
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
