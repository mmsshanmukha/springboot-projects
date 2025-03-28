package Project.FirstProject.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import Project.FirstProject.model.User;
import Project.FirstProject.repository.UserRepository;
import Project.FirstProject.service.UserService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    public UserController() {
		System.out.println("User Controller created");
	}
    @PostConstruct
    public void afterConstruct() {
    	System.out.println("After creation of controller");
    }
    @PreDestroy
    public void beforeDestruction() {
    	System.out.println("Before Destruction of controller");
    }

	@Autowired
    private UserRepository userRepository;
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }
    @GetMapping("/details")
    @ResponseBody
    public List<User> showData() {
    	return userService.getAllDetails();
    }
    @GetMapping("/details/{id}")
    @ResponseBody
    public Optional<User> showDataById(@PathVariable Long id) {
    	return userService.getDataById(id);
    }
    @GetMapping("/user/{id}")
    @ResponseBody
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        Optional<User> user = userService.getDataById(id);
        
        if (user.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "User not found", "status", 404));
        }
        
        return ResponseEntity.ok(user);
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(User user, Model redirectAttributes) {
        // Check if email exists
        User existingUser = userRepository.findByEmail(user.getEmail());
       //System.out.println(existingUser.getEmail());
        if (existingUser == null) {
        	userRepository.save(user);
            redirectAttributes.addAttribute("successMessage", "Registered Successfully!");
            return "redirect:/login";
        }
        redirectAttributes.addAttribute("errorMessage", "Email already registered!");
        return "error";
        
    }
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        User user = userService.loginUser(email, password);
        if (user != null) {
            model.addAttribute("username", user.getUsername());
            return "welcome";
        } else {
            model.addAttribute("errorMessage", "Invalid credentials!");
            return "error";
        }
    }
}
