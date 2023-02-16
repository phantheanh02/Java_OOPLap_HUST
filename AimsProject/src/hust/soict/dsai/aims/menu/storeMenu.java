/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 */
package hust.soict.dsai.aims.menu;

import java.util.Scanner;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

// Store menu
public class storeMenu  {
	public static void StoreMenu() {
		while (true) {
			menu();
			Scanner InputUser = new Scanner(System.in); // The choose of user
			int choose = InputUser.nextInt();
			switch (choose) { // Check user's choose
			case 1: {
				mediaDetailsMenu.MediaDetailsMenu(); // Show media detail
				break;
			}
			/*
			 * Họ và tên: Phan Thế Anh
			 * MSSV: 20204941
			 * Mã lớp: 721428
			 */
			case 2: {
				Aims.myStore.listStore(); // List store
				addToCart(getMediaByTitle()); // Add media to Store if true
				break;
			}
			case 3: {
				Aims.myStore.listStore(); // List Store
				playAMedia(getMediaByTitle()); // Play a media
				break;
			}
			case 4: {
				Aims.myCart.listCart(); // list the cart
				break;
			}
			case 0: {
				return; // Back
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}
	}
	

	/*
	 * Họ và tên: Phan Thế Anh
	 * MSSV: 20204941
	 * Mã lớp: 721428
	 */
	// The function to get a media by title
	public static Media getMediaByTitle() {
		Scanner InputUser = new Scanner(System.in); 
		System.out.println("Please enter title: "); // Input media by title
		String mediaString = InputUser.nextLine();
		for (Media iterable_element : Aims.myStore.itemsInStore) {
			if (iterable_element.getTitle().contains(mediaString)) {
				return iterable_element;
			}
		}
		System.out.println("Not find media!!"); // Notification
		return null;
	}
	

	// The function to add a media to the cart
	public static void addToCart(Media media) {
		if (media != null) { // Check media
			Aims.myCart.addMedia(media); // Add media to the cart
		}
	}
	

	// Menu of storeMenu
	public static void menu() {
		System.out.println("Options: ");
		System.out.println("-----------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("-----------------------------");
		System.out.println("Please choose a number 0-1-2-3-4");
	}
	
	/*
	 * Họ và tên: Phan Thế Anh
	 * MSSV: 20204941
	 * Mã lớp: 721428
	 */
	// The function to play a media
	public static void playAMedia(Media media) {
		if (media instanceof DigitalVideoDisc) { // Check is DVD
			DigitalVideoDisc DVD = (DigitalVideoDisc) media; // Downcasting
			DVD.play(); // play DVD
		}
		else if (media instanceof CompactDisc) { // Check CD
			CompactDisc CD = (CompactDisc) media; // Downcasting
			CD.play(); // Play CD
		}
		else {
			System.out.println("Can't play this media!!"); // else notification
		}
	}
}
