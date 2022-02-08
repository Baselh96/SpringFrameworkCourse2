package com.example.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDAO {

	//Für die Erstellung der Datenbankverbindung
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person> {

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirth_date(rs.getTimestamp("birth_date"));
			
			return person;
		}
		
	}
	
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from Person", new PersonRowMapper());
	}
	
	public Person findById(int id) {
		//return jdbcTemplate.queryForObject("select * from Person where id = "+ id, new BeanPropertyRowMapper(Person.class));
		return  jdbcTemplate.queryForObject("select * from Person where id=?",
				new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findByName(String name) {
		return  jdbcTemplate.queryForObject("select * from Person where name=?",
				new Object[] { name },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findByIdAndLocation(int id, String location) {
		return  jdbcTemplate.queryForObject("select * from Person where location=? and id=?",
				new Object[] { location, id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteAll() {
		return jdbcTemplate.update("delete from Person");
	}
	
	public int deleteById(int id) {
		return  jdbcTemplate.update("delete from Person where id=?",
				new Object[] { id });
	}
	
	public int deleteByName(String name) {
		return  jdbcTemplate.update("delete from Person where name=?",
				new Object[] { name });
	}
	
	
	public int insert(Person person) {
		return  jdbcTemplate.update(
				"insert into person values(?,?,?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(), 
						new Timestamp(person.getBirth_date().getTime()) });
	}
	
	public int update(Person person) {
		return  jdbcTemplate.update(
				"update person "
				+ "set name = ?, location = ?, birth_date = ? "
				+ "where id = ?",
				new Object[] { person.getName(), person.getLocation(), 
						new Timestamp(person.getBirth_date().getTime()), person.getId() });
	}

}
