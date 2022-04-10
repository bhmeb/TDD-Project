package com.in28Minute.junitesting.unittesting.spike;




import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class HamcrestMatchersTest {

	@Test
	public void learning() {
		
		List<Integer> numbers = Arrays.asList(12,15,20);
		assertThat(numbers, hasSize(3));  //Hamcrest lib
	}

}
