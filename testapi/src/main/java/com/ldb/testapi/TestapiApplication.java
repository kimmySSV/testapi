package com.ldb.testapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(TestapiApplication.class, args);
		System.out.println("hello");
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
