package BLC;
public class PrimeCustomer extends Customer{
    protected double discountrate = 10.0;
    public PrimeCustomer(String name){
        super(name);

    }

   // @Override
    public double calculateBill(double ...prices){
        double totalAmount =  super.calculateBill(prices);
        super.printdetails();

        double discountAmount = (totalAmount/100)*discountrate;
        double finalAmount = totalAmount - discountAmount;
        IO.println("Discount RS : "+discountAmount);
        IO.println("Final amount RS : "+finalAmount);
        return 0.0;
    }
}