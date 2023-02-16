/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 */
package hust.soict.dsai.aims.menu;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.Media;


public class cartMenu{
	// Menu
	public static void menu() {
		System.out.println("Options: ");
		System.out.println("-----------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Please order");
		System.out.println("0. Back");
		System.out.println("-----------------------------");
		System.out.println("Please choose a number 0-1-2-3-4-5");
	}
	
	
	public static void CartMenu() {
		while (true) {
			menu();
			// Check the choose of user
			Scanner InputUser = new Scanner(System.in); 
			int choose = InputUser.nextInt();
			switch (choose) {
			case 1: {
				filterMedia(); // Filter medias in cart
				break;
			}
			case 2: {
				sortMediaInCart(); // Sort medias in cart
				break;
			}
			case 3: {
				Aims.myCart.removeMedia(storeMenu.getMediaByTitle()); // Remove media from cart
				break;
			}
			case 4: {
				Aims.myCart.listCart(); 
				storeMenu.playAMedia(getMediaByTitle()); // Play a media by title
				break;
			}
			case 5: {
				PlaceOrder(); // Place order
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
	
	// The “Filter medias in cart” option should allow the user to choose one of two filtering options: by id and by title.
	public static void filterMedia() {
		while (true) {
			// Filter by
			System.out.println("Filter by:");
			System.out.println("1. By id");
			System.out.println("2. By title");
			System.out.println("0. Back");
			// Check the choose of user
			Scanner InputUser = new Scanner(System.in);
			int choose = InputUser.nextInt();
			switch (choose){
			case 1: {
				filterByID(); // Filter by ID
				break;
			}
			case 2: {
				filterByTitle(); // Filter by title
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
	
	// The function filter by ID
	public static void filterByID() {
		System.out.println("Please enter ID: "); // Input ID
		Scanner InputUser = new Scanner(System.in);
		int choose = InputUser.nextInt();
		for (Iterator iterator = Aims.myCart.itemsOrdered.iterator(); iterator.hasNext();) {
			Media type = (Media) iterator.next();
			if (choose == type.getId()) {	// Check ID
				System.out.println(type);
				return;
			}
		}
		System.err.println("Not find!!"); // Notification error
	}
	// The function filter by title
	public static void filterByTitle() {
		// Input title
		System.out.println("Please enter title: "); 
		Scanner InputUser = new Scanner(System.in);
		String choose = InputUser.next();
		if (choose == null) { // Check null
			System.err.println("Not find!!");
			return;
		}
		// Check title
		for (Iterator iterator = Aims.myCart.itemsOrdered.iterator(); iterator.hasNext();) {
			Media type = (Media) iterator.next();
			if (type.getTitle().contains(choose)) { 
				System.out.println(type);
				return;
			}
		}
		System.err.println("Not find!!"); // Notification
	}
	
	// The “Sort medias in cart” option should allow the user to choose one of two sorting option: by title or by cost. 
	public static void sortMediaInCart() {
		while (true) {
			// Menu sort
			System.out.println("Sort by:");
			System.out.println("1. By title");
			System.out.println("2. By cost");
			System.out.println("0. Back");
			// Input choose of user
			Scanner InputUser = new Scanner(System.in);
			int choose = InputUser.nextInt();
			// Check user's choose
			switch (choose){
			case 1: {
				Collections.sort(Aims.myCart.itemsOrdered,Media.COMPARE_BY_TITLE_COST); // Sort by title
				break;
			}
			case 2: {
				Collections.sort(Aims.myCart.itemsOrdered,Media.COMPARE_BY_COST_TITLE); // Sort by cost
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}
	}
	
	// The function to get a media from the Cart by title
	public static Media getMediaByTitle() {
		// Input title
		Scanner InputUser = new Scanner(System.in);
		System.out.println("Please enter title: ");
		String mediaString = InputUser.nextLine();
		// Check title in the Cart
		for (Iterator iterator = Aims.myCart.itemsOrdered.iterator(); iterator.hasNext();) {
			Media type = (Media) iterator.next();
			if (type.getTitle() == mediaString) {
				return type;
			}
		}
		System.out.println("No find media"); // Notification
		return null;
	}
	
	// The function Place Order
	public static void PlaceOrder() {
		Aims.myCart.itemsOrdered.clear(); // Clear the Cart
		System.out.println("An order is created"); // Notification
	}
}
