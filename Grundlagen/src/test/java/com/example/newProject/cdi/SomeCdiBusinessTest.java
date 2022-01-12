package com.example.newProject.cdi;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.newProject.BasicApplication;
import com.example.newProject.CDIApplication;


@RunWith(MockitoJUnitRunner.class)// 
public class SomeCdiBusinessTest {
	
	@InjectMocks
	SomeCDIBusiness someCDIBusiness;
	
	@Mock
	SomeCDIDAO someCDIDAO;

	@Test
	public void testBasicScenario() {
		when(someCDIDAO.getData()).thenReturn(new int[] {2,4,1}).thenReturn(new int[] {20, 10, 30});
		assertEquals(4, someCDIBusiness.findTheGreatest());
		assertEquals(30, someCDIBusiness.findTheGreatest());
	}

}

