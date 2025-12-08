package ELC;

import BLC.*;

public class CakeOrder {
	public static void main(String []args) {
		
	IO.print("Enter Shape of the Cake: ");
	String shape = IO.readln();
	IO.print("Enter flavor of the Cake: ");
	String flavor = IO.readln();
	IO.print("Enter quantity of the Cake: ");
	int quantity = Integer.parseInt(IO.readln());
	IO.print("Want to give any Message: [Y/N]: ");
	String opt = IO.readln();
	if(opt.equalsIgnoreCase("Y") ||opt.equalsIgnoreCase("Yes")) {		
	IO.print("Enter any message: ");
	String message = IO.readln();
	Cake order = new OrderedCake(shape,flavor,quantity,message);
	IO.print(order);
	}
	else {
	Cake order = new OrderedCake(shape,flavor,quantity);
	IO.print(order);
	}
	
	}

}
