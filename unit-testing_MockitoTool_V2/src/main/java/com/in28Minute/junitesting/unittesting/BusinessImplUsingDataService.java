package com.in28Minute.junitesting.unittesting;

import java.util.Arrays;

public class BusinessImplUsingDataService {
	
	DataService dataService;
	
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	
	//make it as a functional programming
	//In below the parameter is array -> convert to stream

	public int calculateSum(int[] data) {
		//data like 1,2,3,4 => reduce like 1+2, 3+3, 6+4
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
		
		//or
		//OptionalInt number = Arrays.stream(data).reduce(Integer::sum);
		//return number.orElse(0);
		
		//Without Functional programming
		/*int sum = 0;
		for(int value:data) {
			sum+=value;
		}
		return sum;*/
	}

	
	//Write with functional programming
	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = dataService.retrieveAllData();
		for(int value:data) {
			sum+=value;
		}
		return sum;
	}

}
