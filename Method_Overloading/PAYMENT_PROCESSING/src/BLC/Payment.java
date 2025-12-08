leCardNumber(String cardNumber){
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
