package Project2.FirstProjectPrep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Project2.FirstProjectPrep.repo.Repositoryy;
import Project2.FirstProjectPrep.service.Service;
import Project2.FirstProjectPrep.user.User1;

@Controller
public class Controllerr {
	
@Autowired
Repositoryy repo;
	@Autowired
	Service service;
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
	    User1 loginUser = service.loginUser(email, password);
	    
	    if (loginUser != null) {
	        model.addAttribute("name", loginUser.getName()); // ✅ Pass name to JSP
	        return "success"; // ✅ Redirect to success.jsp
	    } else {
	        model.addAttribute("errorMessage", "Invalid credentials!"); // ✅ Pass error message to JSP
	        return "error"; // ✅ Redirect to error.jsp
	    }
	}

	@PostMapping("/register")
	public String registerUser(User1 user) {
		repo.save(user);
		return "login";
	}
}
