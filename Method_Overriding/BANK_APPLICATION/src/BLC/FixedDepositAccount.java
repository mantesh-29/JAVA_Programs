package BLC;
public class FixedDepositAccount extends BankAccount{
protected double interestRate = 6.5;
protected int depositTerm;
public FixedDepositAccount(String accountHolderName,String accountNumber, double balance,int depositTerm){
    super(accountHolderName,accountNumber,balance);
    this.depositTerm = validateDeposit(depositTerm);
}
public int validateDeposit(int depositTerm){
    if(depositTerm <=0){
        IO.print("Deposit term must be positive.");
        System.exit(0);
        return 0;
    }else{
        return depositTerm;
    }
}


    public void displayAccountDetails(){
        IO.println("Account Holder: "+accountHolderName);
        IO.println("Account Number: "+accountNumber);
        IO.println("Balance RS :"+balance);
        IO.println("IFSC CODE :"+IFSC_CODE);
        calculateInterest();

    }

public void calculateInterest(){
   // IO.print("Current accounts do not earn interest.");
    double interest = depositTerm*((balance*6.5)/100); 
    IO.println("Fixed Deposit Interest for "+depositTerm+" years RS :"+interest);
}
}
