package com.example.training1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
	@RequestMapping("/greet")
	public String greet() {
		return "greet";
	}

}
