package com.springFrameworkCourse2.mockito.mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SomeBusinessStubTest {

	@Test
	public void findTheGrestestFromAllData() {
		SomeBusinessImpl someBusinessImpl =  new SomeBusinessImpl( new Data());
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(43, result);
	}

}

class Data implements DataService{

	@Override
	public int[] getAllData() {
		return new int[] {2,12,43,1,9};
	}
	
}

