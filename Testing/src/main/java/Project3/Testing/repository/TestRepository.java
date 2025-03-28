package Project3.Testing.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class TestRepository {
	
	public TestRepository() {
	
		System.out.println("I am Repository");
	}
	@PostConstruct
	public void postt() {
		System.out.println("Repo Post Construct with: "+this.hashCode());
	}
}
