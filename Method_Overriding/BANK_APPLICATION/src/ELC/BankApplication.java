package ELC;
import BLC.BankAccount;
import BLC.CurrentAccount;
import BLC.FixedDepositAccount;
import BLC.SavingsAccount;
public class BankApplication{
    public static void main(){
    	IO.println("Please select the Account Type :\r\n"
    			+ "        1) Saving Account\r\n"
    			+ "        2) Current Account\r\n"
    			+ "        3) Fixed Deposit Account\r\n"
    			+ "   Please enter the type of account you want to open : [1/2/3]");
        int choice = Integer.parseInt(IO.readln());
        
        switch(choice){
            case 1->{
            	IO.print("Enter account Holder Name :");
                String accountHolderName = IO.readln();
                IO.print(" Enter account Number :");
                String accountNumber = IO.readln();
                IO.print(" Enter Balance :");
                double balance = Double.parseDouble(IO.readln());
                BankAccount savings = new SavingsAccount(accountHolderName,accountNumber,balance);
                savings.displayAccountDetails();
            }
            case 2->{
            	IO.print("Enter account Holder Name :");
                String accountHolderName = IO.readln();
                IO.print(" Enter account Number :");
                String accountNumber = IO.readln();
                IO.print(" Enter Balance :");
                double balance = Double.parseDouble(IO.readln());
                BankAccount current = new CurrentAccount(accountHolderName,accountNumber,balance);
                current.displayAccountDetails();

            }
            case 3->{
            	IO.print("Enter account Holder Name :");
                String accountHolderName = IO.readln();
                IO.print(" Enter account Number :");
                String accountNumber = IO.readln();
                IO.print(" Enter Balance :");
                double balance = Double.parseDouble(IO.readln());
                IO.print(" Enter the deposit term [For How many years you want to deposit] :" );
                int depositTerm = Integer.parseInt(IO.readln());
                BankAccount fixed = new FixedDepositAccount(accountHolderName,accountNumber,balance,depositTerm);
                fixed.displayAccountDetails();

            }
        }
    }
}