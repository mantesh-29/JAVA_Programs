package ELC;
import BLC.*;
public class PaymentProcessing {

	public static void main(String[] args) {
		Payment CreditcardPayment = new CreditCardPayment();
		Payment UPIPayment = new UPIPayment();
		Payment DebitCardPayment = new DebitCardPayment();
			paymentGateway(CreditcardPayment,DebitCardPayment,UPIPayment);
	}
	public static void paymentGateway(Payment ...payments) {
		for (Payment payment : payments) {
			payment.processPayment();
			
		}
	}

}
