package com.in28Minute.junitesting.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BusinessImplTest {

	@Test
	void calculateSum_basic() {
		
		BusinessImpl businessImpl = new BusinessImpl();
		int calculate = businessImpl.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		
		assertEquals(expectedResult, calculate);
	}
	
	@Test
	void calculateSum_empty() {
		
		BusinessImpl businessImpl = new BusinessImpl();
		int calculate = businessImpl.calculateSum(new int[] {});
		int expectedResult = 0;
		
		assertEquals(expectedResult, calculate);
	}
	
	@Test
	void calculateSum_oneValue() {
		
		BusinessImpl businessImpl = new BusinessImpl();
		int calculate = businessImpl.calculateSum(new int[] {5});
		int expectedResult = 5;
		
		assertEquals(expectedResult, calculate);
	}


}
