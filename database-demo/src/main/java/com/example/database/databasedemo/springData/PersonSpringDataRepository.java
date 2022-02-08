package com.example.database.databasedemo.springData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.databasedemo.entity.PersonSpringData;

@Repository
public interface PersonSpringDataRepository extends JpaRepository<PersonSpringData, Integer> {

}
