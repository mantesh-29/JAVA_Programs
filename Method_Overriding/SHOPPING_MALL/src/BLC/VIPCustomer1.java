package BLC;

public class VIPCustomer1 extends Customer {
	protected double discountrate = 15.0;

	public VIPCustomer1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// @Override
	public double calculateBill(double... prices) {
		double totalAmount = super.calculateBill(prices);
		super.printdetails();

		double discountAmount = (totalAmount / 100) * discountrate;
		double finalAmount = totalAmount - discountAmount;
		IO.println("Discount RS : " + discountAmount);
		IO.println("Final amount RS : " + finalAmount);
		return 0.0;
	}

}