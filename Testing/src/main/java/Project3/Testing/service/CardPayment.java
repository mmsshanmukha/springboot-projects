package Project3.Testing.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CardPayment implements PaymentService{

	@Override
	public void proceedPayment(double amount) {
		System.out.println("Card payment Successful!!!!!!!");
	}

}
