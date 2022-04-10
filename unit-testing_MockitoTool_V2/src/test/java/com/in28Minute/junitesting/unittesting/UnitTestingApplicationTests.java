package com.in28Minute.junitesting.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = {"classpath:test-configurations.properties"})
class UnitTestingApplicationTests {

	@Test
	void contextLoads() {
	}

}