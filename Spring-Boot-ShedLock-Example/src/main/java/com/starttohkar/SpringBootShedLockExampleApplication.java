package com.starttohkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootShedLockExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootShedLockExampleApplication.class, args);
	}

}
