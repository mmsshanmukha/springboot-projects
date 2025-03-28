package Project3.Testing.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class UpiPayment implements PaymentService{

	@Override
	public void proceedPayment(double amount) {
		System.out.println("Upi payment Successful!!!!!!!");
	}

}
