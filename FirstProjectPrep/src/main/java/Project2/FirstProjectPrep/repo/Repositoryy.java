package Project2.FirstProjectPrep.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Project2.FirstProjectPrep.user.User1;

public interface Repositoryy extends JpaRepository<User1, Long>{
	User1 findByEmail(String email);
}
