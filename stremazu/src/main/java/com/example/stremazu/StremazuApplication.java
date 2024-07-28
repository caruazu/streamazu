package com.example.stremazu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StremazuApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StremazuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world");
	}
}
