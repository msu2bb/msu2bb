package com.example.training1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/") 
	public String home() {
		return "안녕 Spring Boot!!!!!";
	}

}
