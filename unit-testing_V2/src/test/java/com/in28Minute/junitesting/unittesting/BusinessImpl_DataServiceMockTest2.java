package com.in28Minute.junitesting.unittesting;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;


class BusinessImpl_DataServiceMockTest2 {
	
	BusinessImplUsingDataService business = new BusinessImplUsingDataService();
	DataService dataServiceMock= mock(DataService.class);
	
	
	/*@Before
	public void setup() {
		business.setDataService(dataServiceMock);
	}*/
	 

	@Test
	void calculateSumUsingDataService_basic() {
		
		business.setDataService(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		 //int actualResult = business.calculateSumUsingDataService(); 
		 //int expectedResult = 6;
		assertEquals(6, business.calculateSumUsingDataService());
	}

	@Test
	void calculateSumUsingDataService_empty() {
		
		business.setDataService(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		//int actualResult = business.calculateSumUsingDataService();
		//int expectedResult = 0;
		assertEquals(0, business.calculateSumUsingDataService());
	}

	@Test
	void calculateSumUsingDataService_oneValue() {
		business.setDataService(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
		//int actualResult = business.calculateSumUsingDataService();
		//int expectedResult = 5;
		assertEquals(5, business.calculateSumUsingDataService());
	}

}
