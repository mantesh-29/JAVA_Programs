package BLC;

public class GeneralCustomer extends Customer{
    public GeneralCustomer(String name){
    super(name);
    }
     
    public double calculateBill(double ...prices){
    
      double totalAmount =  super.calculateBill(prices);
      super.printdetails();
        IO.println("Discount: No discount for general customers.");
       return super.calculateBill(prices);
       
    }


}