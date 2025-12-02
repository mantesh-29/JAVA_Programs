package BLC;


public class CurrentAccount extends BankAccount{
    protected double overdraftLimit = 5000.0;
public CurrentAccount(String accountHolderName,String accountNumber, double balance){
    super(accountHolderName,accountNumber,balance);
}

    public void displayAccountDetails(){
        IO.println("Account Holder: "+accountHolderName);
        IO.println("Account Number: "+accountNumber);
        IO.println("Balance RS :"+balance);
        IO.println("IFSC CODE :"+IFSC_CODE);
        calculateInterest();
        checkOverdraftLimit();

    }
public void calculateInterest(){
    IO.println("Current accounts do not earn interest.");
   // double interest = (balance/100)*4.0; 
}
public void checkOverdraftLimit(){
IO.print("Overdraft limit RS :"+overdraftLimit);
}

}
