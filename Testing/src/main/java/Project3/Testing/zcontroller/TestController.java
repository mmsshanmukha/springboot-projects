package Project3.Testing.zcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project3.Testing.service.TestService;
import jakarta.annotation.PostConstruct;
@RestController
@RequestMapping("/api")
public class TestController {
	@Autowired
	TestService ts;
	public TestController() {
		System.out.println("I am controller" );
	}
	@PostConstruct
	public void init() {
		System.out.println("I am controller with: "+this.hashCode()+" and Service with: "+ts.hashCode());
	}
	@GetMapping("/hello")
	public void greet() {
		System.out.println("Hello");
	}
	
	@GetMapping("/fetchuser")
	public ResponseEntity<String> getUserDetails(){
		System.out.println("Fetch user data");
		return ResponseEntity.status(HttpStatus.OK).body("OK");
	}
}
