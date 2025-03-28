package Project3.Testing.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public interface PaymentService {
	void proceedPayment(double amount);
}
