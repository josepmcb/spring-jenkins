package com.javatechie.jenkins.api;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SpringJenkinsApplication {

	@PostConstruct
	public void init() {
		log.info("Application started...");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);

		log.info("Application executed");
	}

}
