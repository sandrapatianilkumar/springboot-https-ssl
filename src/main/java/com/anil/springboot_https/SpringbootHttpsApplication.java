package com.anil.springboot_https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHttpsApplication.class, args);
	}

	@GetMapping
	public  String getText(){
		return  "validating https certification";
	}

}
