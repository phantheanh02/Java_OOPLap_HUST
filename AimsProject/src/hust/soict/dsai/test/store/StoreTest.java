/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Class: StoreTest
 */

package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		Store itemsInStore = new Store();
		// Create object
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 24.95f);
		// Add object to arraylist
		itemsInStore.addDVD(dvd1);;
		itemsInStore.addDVD(dvd1);

		// Remove object to arraylist
		itemsInStore.removeDVD(dvd1);
		for (int i = 0; i < itemsInStore.itemsInStore.size(); i++) {
			System.out.println(itemsInStore.itemsInStore.get(i)); // Print element of arraylist
		}
	} // End main
}
