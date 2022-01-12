package com.springFrameworkCourse2.junit;

import java.util.Arrays;

public class MyMath {

	public int sum( int[] numbers ) throws Exception {
		if(numbers.length == 0) throw new Exception();
		 return Arrays.stream(numbers).sum();		
	}
}
