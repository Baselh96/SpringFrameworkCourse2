package com.example.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.database.databasedemo.entity.PersonJpa;


@Repository
@Transactional // Normalewesie schreiben wir es bei unsere APIs
public class PersonJpaRepository {
	
	//To connect with DB
	@PersistenceContext
	EntityManager entityManager;
	
	public List<PersonJpa> findAll() {
		TypedQuery<PersonJpa> namQuery= entityManager.createNamedQuery("find_all_persons", PersonJpa.class);
		return namQuery.getResultList();
	}
	
	public PersonJpa findById(int id) {
		return entityManager.find(PersonJpa.class, id);
	}

	public PersonJpa insert(PersonJpa person) {
		return entityManager.merge(person);
	}
	
	public PersonJpa update(PersonJpa person) {
		return entityManager.merge(person);
	}
	
	public void deleteById(int id) {
		PersonJpa personJpa = findById(id);	
		entityManager.remove(personJpa);
	}

}
