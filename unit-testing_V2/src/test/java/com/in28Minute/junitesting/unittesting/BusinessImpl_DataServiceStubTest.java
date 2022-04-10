package com.in28Minute.junitesting.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 1, 2, 3 };
	}

}

class DataServiceEmptyStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { };
	}

}

class DataServiceOneValueStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 5};
	}

}

class BusinessImpl_DataServiceStubTest {

	@Test
	void calculateSumUsingDataService_basic() {

		BusinessImplUsingDataService business = new BusinessImplUsingDataService();
		business.setDataService(new DataServiceStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSumUsingDataService_empty() {

		BusinessImplUsingDataService business = new BusinessImplUsingDataService();
		business.setDataService(new DataServiceEmptyStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 0;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSumUsingDataService_oneValue() {

		BusinessImplUsingDataService business = new BusinessImplUsingDataService();
		business.setDataService(new DataServiceOneValueStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 5;

		assertEquals(expectedResult, actualResult);
	}

}
