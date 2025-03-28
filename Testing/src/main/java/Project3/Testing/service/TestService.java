package Project3.Testing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Project3.Testing.repository.TestRepository;
import Project3.Testing.zcontroller.TestController;
import jakarta.annotation.PostConstruct;
@Component
public class TestService {
	@Autowired
	TestRepository ts;
	@Autowired
	PaymentService ps;
	public TestService() {
		System.out.println("I am Service");
	}
	@PostConstruct
	public void payment() {
		ps.proceedPayment(1000.0);
	}
	
	public void init() {
		System.out.println("I am Service with: "+this.hashCode()+" Repo with: "+ts.hashCode());
	}
}
