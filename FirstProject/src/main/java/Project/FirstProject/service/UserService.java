package Project.FirstProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.FirstProject.model.User;
import Project.FirstProject.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
//
//    public void registerUser(User user) {
//        userRepository.save(user);
//    }

    public User loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

	public List<User> getAllDetails() {
		return userRepository.findAll();
	}

	public Optional<User> getDataById(Long id) {
		return userRepository.findById(id);
	}
}
