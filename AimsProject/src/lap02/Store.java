package lap02;

import java.util.ArrayList;

public class Store {
	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	
	// Create method addDVD
	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore.add(disc);
	}
	
	// Create method removeDVD
	public void removeDVD(DigitalVideoDisc disc) {
		itemsInStore.remove(disc);
	}
	
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				"The Lion King", "Animation", "Roger Allers", 87, 24.95f);
		ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
		itemsInStore.add(dvd1);
		itemsInStore.add(dvd1);

		itemsInStore.add(dvd1);
		itemsInStore.add(dvd1);
		itemsInStore.remove(dvd1);
		for (int i = 0; i < itemsInStore.size(); i++) {
			System.out.println(itemsInStore.get(i));
		}
	}
}
