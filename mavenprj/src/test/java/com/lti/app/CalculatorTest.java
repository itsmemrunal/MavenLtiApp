package com.lti.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1() {
		int res= new Calculator().add(5, 2);
		assertEquals(7,res);
		
	}
	
	@Test
	public void test2() {
		int res= new Calculator().add(8, 2);
		assertEquals(10,res);
		
	}
	
	@Test
	public void test3() {
		int res= new Calculator().prod(5, 2);
		assertEquals(10,res);
		
	}
	@Test
	public void test4() {
		int res= new Calculator().prod(8, 2);
		assertEquals(16,res);
		
	}




}
