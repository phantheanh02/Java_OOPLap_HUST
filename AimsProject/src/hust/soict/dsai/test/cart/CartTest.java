/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Class: CartTest
 */
package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
	// Beign main
	public static void main(String[] args) {
		// Create new cart
		Cart cart = new Cart();
		// Creat new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		// Creat new DVD objects and add them to the cart
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(
				"Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		// Creat new DVD objects and add them to the cart
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(
				"Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		// test method
		//cart.removeDigitalVideoDisc(dvd3); // remove dvd3
		//cart.listCart();	// list cart
		//System.out.println(cart.totalCost()); // calculate total cost
		//cart.searchID(2); // Search disc by ID
		cart.searchTitle("No"); // Search disc by title
	} // End main
}
