package com.example.newProject.xml;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

// Laden des Application-Kontexts
@RunWith(SpringRunner.class)// Laden des Kontexts
@ContextConfiguration(locations = "/applicationContext.xml")// Definieren des Kontexts
public class BinarySearchXmlConfigurationTest {
	
	// Holen einer Instanze von der Klasse BinarySearchImpI
	@Autowired
	XmlPersonDAO xmlPersonDAO;

	@Test
	public void testBasicScenario() {
		
		int result = xmlPersonDAO.returnFirst(new int[] {30,23,2});
		
		assertEquals(30, result);

	}

}
