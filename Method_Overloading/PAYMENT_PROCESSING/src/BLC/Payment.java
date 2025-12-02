package BLC;

public class Payment {
	public void makePayment(double amount){
		if(validateAmount(amount)){
		IO.println("Processing payment via Cash...");
		IO.println("Amount Paid RS :"+amount);
		IO.println("Payment Successful!");
		}
		}
		public void makePayment(String cardHolderName, String creditCardNumber, double
		amount){
		if(validateAmount(amount) && validateCardNumber(creditCardNumber)){
		IO.println("Processing payment via Credit Card...");
		IO.println("Card Holder: "+cardHolderName);
		IO.println("Card Number: ****_****_****_"+maskCardNumber(creditCardNumber));
		IO.println("Amount Paid RS :"+amount);
		IO.println("Payment Successful!");
		}
		}
		public void makePayment(
		String debitCardNumber, double amount){
		if(validateCardNumber(debitCardNumber) && validateAmount(amount)){
		IO.println("Processing payment via Debit Card...");
		IO.println("Card Number: ****_****_****_"+maskCardNumber(debitCardNumber));
		IO.println("Amount Paid RS :"+amount);
		IO.println("Payment Successful!");
		}
		}
		private boolean validateAmount(double amount){
		if(amount == 0 || amount < 0 ){
		IO.println("Error: Amount must be greater than zero.");
		return false;
		}
		else
		return true;
		}
		private boolean validateCardNumber(String cardNumber){
			if(cardNumber.length() == 16 ){
				return true;
				}
				else {
				IO.println("Error: Invalid card number. It must be 16 digits.");
				return false;
				}
				}
				private String maskCardNumber(String cardNumber){
				String maskedCardNumber = "";
				for(int i=cardNumber.length()-4;i<=cardNumber.length()-1;i++){
				maskedCardNumber+=cardNumber.charAt(i);
				}
				return maskedCardNumber;
				}
}
