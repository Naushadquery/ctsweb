package com.nau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

	@GetMapping
	public String getMessage() {
		return "Welcome to Jenkins";
	}
	
	@GetMapping("greet/{name}")
	public String  greet(@PathVariable String name) {
		return "Welcome " + name;
	}
}
