package com.springFrameworkCourse2.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void testSize() {
		List list = mock(List.class);
		when(list.size()).thenReturn(10);
		
		assertEquals(10, list.size());	
		assertEquals(10, list.size());// es wird immer das selbe zurückgegeben
	}
	
	@Test
	void testSize_MultiReturns() {
		List list = mock(List.class);
		when(list.size()).thenReturn(10).thenReturn(20);
		
		assertEquals(10, list.size());	// hier wird 10 zurückgegeben, weil es das erste Return ist
		assertEquals(20, list.size());	// hier wird 20 zurückgegeben, weil es das zweite Return ist
		assertEquals(20, list.size());	// hier wird 20 zurückgegeben, weil es immer das letzte Return zurückgebt
	}

	@Test
	void getTest() {
		List list = mock(List.class);
		when(list.get(0)).thenReturn("1. Element");
		when(list.get(1)).thenReturn("2. Element");
		
		assertEquals("1. Element", list.get(0));	
		assertEquals("2. Element", list.get(1));	
		assertEquals(null, list.get(2));	// da kein Element an die Position 2 gibt
	}
	
	
	@Test
	void getTestWithAnyThing() {
		List list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenReturn("any Element");
		
		assertEquals("any Element", list.get(0));	
		assertEquals("any Element", list.get(1));	
		assertEquals("any Element", list.get(2));
	}
}
