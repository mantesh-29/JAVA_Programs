package BLC;

public class BankAccount{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE = "SBIHYD151285";

    BankAccount(String accountHolderName,String accountNumber, double balance){
        this.accountHolderName = validateAccountHolder(accountHolderName);
        this.accountNumber = validateAccountNumber(accountNumber);
        this.balance = validateBalance(balance);
    }
    public double validateBalance(double balance){
        if(balance <=0 ){
            IO.print("Balance cannot be negative.");
            System.exit(0);
            return 0.0;
        }else{
        return balance;
        } 
    }
    public String validateAccountHolder(String accountHolderName){
        if(accountHolderName.isBlank()){
            IO.println("Account holder name cannot be empty.");
            System.exit(0);
            return "";
        }
        else{
         return accountHolderName;
        }
    }
    public String validateAccountNumber(String accountNumber){
        if(accountNumber.isBlank()){
            IO.print("Account number cannot be empty.");
            System.exit(0);
            return "";
        }else{
            return accountNumber;
        }
    }

    public void calculateInterest(){
        IO.print("Generic Account ");
    }
    public void displayAccountDetails(){
        IO.println("Account Holder: "+accountHolderName);
        IO.println("Account Number: "+accountNumber);
        IO.println("Balance RS :"+balance);
        IO.println("IFSC CODE :"+IFSC_CODE);
        IO.print("Savings Account Interest RS :");
        calculateInterest();

    }

}

