package BLC;

public class Customer{
    protected String name;
   protected double totalAmount;
    public Customer(String name){
        if(name.isBlank()){
            IO.println("Please Enter Customer Name");
            System.exit(0);
        }else{
        this.name = name;
    //    this.total = total;
        }
    }
       //    double totalAmount = 0;
  public double calculateBill(double ...prices){
        for(double d : prices){
        if(d <=0){
            IO.println("Item price cannot be negative.");
            System.exit(0);
        }
        else{
            totalAmount+= d;
        }
        }
        return totalAmount;
    }

    public void printdetails(){
        IO.println("Welcome to Hyderabad Mall :");
        IO.println("Customer: "+name);
        IO.println("Total cost RS : "+totalAmount);
    }
}

