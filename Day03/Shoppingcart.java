package Day03;

public class Shoppingcart {
	
	void add_to_cart(String category , int price) {
		System.out.println("Your category:"+category);
		System.out.println("Item Price:"+price);
	}
	
	void add_to_cart(String category , int price , int quantity) {
		int total = price * quantity;
		System.out.println("Total is:"+total);
	}
	
	public static void main(String[] args) {
		Shoppingcart in = new Shoppingcart();
		in.add_to_cart("Electronics", 200000);
		in.add_to_cart("Electronics", 200000, 2);
	}

}
