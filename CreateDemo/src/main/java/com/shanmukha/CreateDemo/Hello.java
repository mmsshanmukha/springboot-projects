package com.shanmukha.CreateDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/")
	public String greet() {
		System.out.println("Hello");
		return "hello world";
	}
}
