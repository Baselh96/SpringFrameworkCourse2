package com.springFrameworkCourse2.mockito.mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


public class SomeBusinessMockTest {
	
	@Test
	public void findTheGrestestFromAllData() {
		DataService dataService = mock(DataService.class);
		when(dataService.getAllData()).thenReturn(new int[] {24,6,19});
		
		SomeBusinessImpl someBusinessImpl =  new SomeBusinessImpl(dataService);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
	
	@Test
	public void findTheGrestestFromAllData_ForOneValue() {
		DataService dataService = mock(DataService.class);
		when(dataService.getAllData()).thenReturn(new int[] {6});
		
		SomeBusinessImpl someBusinessImpl =  new SomeBusinessImpl(dataService);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(6, result);
	}
	
	@Test
	public void findTheGrestestFromAllData_ForEmpty() {
		DataService dataService = mock(DataService.class);
		when(dataService.getAllData()).thenReturn(new int[] {});
		
		SomeBusinessImpl someBusinessImpl =  new SomeBusinessImpl(dataService);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(Integer.MIN_VALUE, result);
	}

}


