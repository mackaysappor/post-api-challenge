package com.stn.postapichallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PostApiChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApiChallengeApplication.class, args);
	}

	@RestController
	class WelcomeController {
		@GetMapping("/")
		public String hello() {
			return "Welcome to the STN Challenge post api";
		}
	}
}
