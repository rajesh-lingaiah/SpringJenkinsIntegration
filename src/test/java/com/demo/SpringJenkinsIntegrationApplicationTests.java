package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("testcase executing ");
		assertEquals(true, true);
	}

}
