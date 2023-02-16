package lap02;

public class CartTest {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		// ArrayList<DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>();
		// Tạo new cart
		Cart cart = new Cart();
		// Creat new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(
				"Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(
				"Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		//cart.removeDigitalVideoDisc(dvd3); // remove
		//cart.listCart();	// list cart
		//System.out.println(cart.totalCost());
		//cart.searchID(4);
		//cart.searchTitle("The");
	}
}
