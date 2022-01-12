package com.springFrameworkCourse2.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("befor");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeClass
	public static void beforClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
	

	@Test
	public void sum_with_3_Numbers() throws Exception {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
		assertNotEquals(0, myMath.sum(new int[] {1,2,3}));
		
		assertFalse(6 != myMath.sum(new int[] {1,2,3}));
		assertTrue(6 == myMath.sum(new int[] {1,2,3}));
		
		assertNotNull(myMath.sum(new int[] {1,2,3}));
		assertNull(null);
		
		assertThrows(Exception.class, () -> myMath.sum(new int[] {}));		
		
	}
	
	@Test
	public void sum_with_1_Numbers() throws Exception {
		System.out.println("Test2");
		assertEquals(1, myMath.sum(new int[] {1}));
		assertNotEquals(0, myMath.sum(new int[] {1}));
		
		assertFalse(1 != myMath.sum(new int[] {1}));
		assertTrue(1 == myMath.sum(new int[] {1}));
		
		assertNotNull(myMath.sum(new int[] {1}));
		assertNull(null);
		
		assertThrows(Exception.class, () -> myMath.sum(new int[] {}));		
		
	}

}
