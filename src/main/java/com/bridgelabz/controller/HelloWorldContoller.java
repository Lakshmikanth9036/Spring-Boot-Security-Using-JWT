package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {

	@RequestMapping("/hello")
	public String firstPage() {
		return "Hello World";
	}
}
