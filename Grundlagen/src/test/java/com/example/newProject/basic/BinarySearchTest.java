package com.example.newProject.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.newProject.BasicApplication;

// Laden des Application-Kontexts
@RunWith(SpringRunner.class)// Laden des Kontexts
@ContextConfiguration(classes = BasicApplication.class)// Definieren des Kontexts
public class BinarySearchTest {
	
	// Holen einer Instanze von der Klasse BinarySearchImpI
	@Autowired
	BinarySearchImpI binarySearchImpI;

	@Test
	public void testBasicScenario() {
		int resultForTestCase1 = binarySearchImpI.binarySearch(new Integer[] {1,2,4,5,9}, 2);
		int resultForTestCase2 = binarySearchImpI.binarySearch(new Integer[] {1,2,4,5,9}, 20);
		assertEquals(1, resultForTestCase1);
		assertEquals(-1, resultForTestCase2);
	}

}
