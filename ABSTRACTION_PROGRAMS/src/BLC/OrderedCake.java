package BLC;

public class OrderedCake extends Cake {
	private String message="";

	public OrderedCake() {
		super("Round", "Vanilla", 1);
		
	}
	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape,flavor ,quantity );	
	}
	public OrderedCake(String shape, String flavor, int quantity,String message) {
		super(shape,flavor ,quantity );	
		this.message = message;
	}
	
	public String toString() {
		if(this.message.isBlank()) {
			return super.toString();
		}else {			
			return "A "+ super.getShape()+" "+super.getFlavor()+" Cake of "+super.getQuantity()+"KG is Ready with "+this.message+" message @Rs."+(super.price*super.getQuantity());	}
		}

}
