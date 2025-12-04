package ELC;
import BLC.*;

public class ShoppingMall{
    void main(){
    		IO.println(" Please select the Customer Type to get additional Discount :\r\n"
    				+ "		 1) General Customer \r\n"
    				+ "		 2) Prime Customer \r\n"
    				+ "		 3) VIP Customer ");
        int choice = Integer.parseInt(IO.readln());
        IO.println("Enter Customer Name: ");
        String name = IO.readln();
        IO.println("Enter total items : ");
        int items = Integer.parseInt(IO.readln());
        String itemName[] = new String[items];
        double itemPrice[] = new double[items];
        switch(choice){
            case 1 ->{
                for(int i = 0; i < items;i++){
                	IO.println("Enter item name : ");
                     itemName[i] = IO.readln();
                     IO.println("Enter item price : ");
                     itemPrice[i] = Double.parseDouble(IO.readln()); 
                }
                Customer cust = new GeneralCustomer(name);
                generateBill(cust,itemPrice);

            }
            case 2->{
                for(int i = 0; i < items;i++){
                	IO.println("Enter item name : ");
                     itemName[i] = IO.readln();
                     IO.println("Enter item price : ");
                     itemPrice[i] = Double.parseDouble(IO.readln()); 
                }
                Customer cust = new PrimeCustomer(name);
                generateBill(cust,itemPrice);

            }
            case 3->{
                for(int i = 0; i < items;i++){
                	IO.println("Enter item name : ");
                     itemName[i] = IO.readln();
                     IO.println("Enter item price : ");
                     itemPrice[i] = Double.parseDouble(IO.readln()); 
                }
                Customer cust = new VIPCustomer1(name);
                generateBill(cust,itemPrice);
            }
        }
    }

    public static void generateBill(Customer cust , double ...prices){   
            cust.calculateBill(prices);   
    }
}
