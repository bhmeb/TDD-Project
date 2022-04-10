package com.in28Minute.junitesting.unittesting.spike;




import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AssertJTest {

	@Test
	public void learning() {
		
		List<Integer> numbers = Arrays.asList(12,15,20);
		//assertThat(numbers, hasSize(3));  //Hamcrest lib
		assertThat(numbers).hasSize(3)
						.contains(12,15)
						.allMatch(x -> x > 10);
		
		assertThat("").isEmpty();
		assertThat("ABCD").contains("BCD")
						.startsWith("ABC")
						.endsWith("CD");
		
	}

}
