package Project2.FirstProjectPrep.service;

import org.springframework.beans.factory.annotation.Autowired;
import Project2.FirstProjectPrep.repo.Repositoryy;
import Project2.FirstProjectPrep.user.User1;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repositoryy repo;
	public User1 loginUser(String email,String password) {
		
		User1 user=repo.findByEmail(email);
		System.out.println(user.getEmail());
		if(user!=null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
}
