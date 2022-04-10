package com.in28Minute.junitesting.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


class BusinessImpl_DataServiceMockTest {

	@Test
	void calculateSumUsingDataService_basic() {
		BusinessImplUsingDataService business = new BusinessImplUsingDataService();
		DataService dataServiceMock= mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSumUsingDataService_empty() {
		BusinessImplUsingDataService business = new BusinessImplUsingDataService();
		DataService dataServiceMock= mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 0;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSumUsingDataService_oneValue() {
		BusinessImplUsingDataService business = new BusinessImplUsingDataService();
		DataService dataServiceMock= mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 5;

		assertEquals(expectedResult, actualResult);
	}

}
