package Project3.Testing.controller;

import org.springframework.stereotype.Controller;

import Project3.Testing.service.TestService;
@Controller
public class TestController {
	TestService ts;
	public TestController(TestService ts) {
		this.ts=ts;
		System.out.println("I am controller");
	}
}
