package com.springFrameworkCourse2.mockito.mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationTest {
	
	@Mock
	DataService dataService;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	

	@Test
	public void findTheGrestestFromAllData() {
		when(dataService.getAllData()).thenReturn(new int[] {24,6,19, 40});
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(40, result);
	}
	
	@Test
	public void findTheGrestestFromAllData_ForOneValue() {
		when(dataService.getAllData()).thenReturn(new int[] {6});
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(6, result);
	}
	
	@Test
	public void findTheGrestestFromAllData_ForEmpty() {
		when(dataService.getAllData()).thenReturn(new int[] {});
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(Integer.MIN_VALUE, result);
	}

}


