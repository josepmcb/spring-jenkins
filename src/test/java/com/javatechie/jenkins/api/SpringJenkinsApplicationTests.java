package com.javatechie.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {

		log.info("Test case executing...");
		assertEquals(true, true);
	}

}
