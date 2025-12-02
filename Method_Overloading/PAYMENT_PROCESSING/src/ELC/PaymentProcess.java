package ELC;
import BLC.Payment;
public class PaymentProcess {

	public static void main(String[] args) {
		IO.println("Select Payment Option");
		IO.println("1) Via Cash");
		IO.println("2) Via Credit Card");
		IO.println("3) Via Debit Card");
		IO.println("___________________________________");
		IO.print("Enter Payment Option Number : ");
			int choice = Integer.parseInt(IO.readln());
			Payment paymentMethod = new Payment();
			switch(choice){
			case 1 ->{
				IO.print("Enter Payment Amount : ");
			double amount = Double.parseDouble(IO.readln());
			paymentMethod.makePayment(amount);
			}
			case 2 ->{
			String name = IO.readln();
			IO.print("Enter Card Number : ");
			String creditCardNumber = IO.readln();
			IO.print("Enter Payment Amount : ");
			double amount = Double.parseDouble(IO.readln());
			paymentMethod.makePayment(name,creditCardNumber,amount);
			}
			case 3 ->{
				IO.print("Enter Card Number : ");
			String debitCardNumber = IO.readln();
			IO.print("Enter Payment Amount : ");
			double amount = Double.parseDouble(IO.readln());
			paymentMethod.makePayment(debitCardNumber,amount);
			}
					}
	}

}
