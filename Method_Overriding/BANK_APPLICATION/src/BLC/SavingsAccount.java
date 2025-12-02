package BLC;

public class SavingsAccount extends BankAccount{
protected double interestRate = 4.0;
public SavingsAccount(String accountHolderName,String accountNumber, double balance){
    super(accountHolderName,accountNumber,balance);
}
    public void displayAccountDetails(){
        IO.println("Account Holder: "+accountHolderName);
        IO.println("Account Number: "+accountNumber);
        IO.println("Balance RS :"+balance);
        IO.println("IFSC CODE :"+IFSC_CODE);
        calculateInterest();

    }
public void calculateInterest(){
    double interest = (balance/100)*4.0; 
        IO.print("Savings Account Interest RS :"+interest);

    
}
}
