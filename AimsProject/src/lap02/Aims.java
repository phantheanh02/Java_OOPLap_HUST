package lap02;

public class Aims {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		// ArrayList<DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>();
		// Tạo new cart
		Cart anOrder = new Cart();
		// Creat new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(
				"The Dogs King", "Animation", "Roger Allers", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(
				"The Cat King", "Animation", "Roger Allers", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd3);

		//anOrder.removeDigitalVideoDisc(dvd3); // remove
		//anOrder.listCart();	// list cart
		//System.out.println(anOrder.totalCost());
		//anOrder.searchID(4);
		//anOrder.searchTitle("The");
	}
}
