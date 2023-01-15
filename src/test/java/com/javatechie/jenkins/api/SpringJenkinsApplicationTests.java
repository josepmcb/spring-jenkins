package com.javatechie.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {

		log.info("Test case executing...");
		log.info("Test case executing segon missatge...");
		assertEquals(true, true);
	}

}
