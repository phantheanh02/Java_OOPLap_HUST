/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 */
package hust.soict.dsai.aims.menu;

import java.util.Scanner;

import hust.soict.dsai.aims.media.Media;
public class mediaDetailsMenu {
	public static void MediaDetailsMenu() {
		while (true) {
			Media media = storeMenu.getMediaByTitle(); // Get a media from the store by title
			if (media == null) { // Check is null
				return ;
			}
			menu(); 
			Scanner InputUser = new Scanner(System.in);
			int choose = InputUser.nextInt(); // Get the choose of user
			switch (choose) { // Chech user's choose
			case 1: {
				storeMenu.addToCart(media); // Add a media to the Cart
				return;
			}
			case 2: {
				storeMenu.playAMedia(media); // Play a media
				return;
			}
			case 0: {
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}
	}
	

	// Menu
	private static void menu() {
		System.out.println("Options: ");
		System.out.println("-----------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Exit");
		System.out.println("-----------------------------");
		System.out.println("Please choose a number 0-1-2");
	}
}
