/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 */
package hust.soict.dsai.aims.menu;
import java.util.Scanner;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class updateStore {
	// Main table
	public static void UpdateStore() {
		while (true) {
			menu(); // Print menu
			Scanner InputUser = new Scanner(System.in);
			int choose = InputUser.nextInt(); // The choose of user
			switch (choose) { // Check user's choose

			case 1: {
				addToStore(); // add a media
				break;
			}
			case 2: {
				Aims.myStore.removeMedia(storeMenu.getMediaByTitle()); // remove a media
				break;
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
	public static void menu() {
		System.out.println("Option: ");
		System.out.println("1. Add a media");
		System.out.println("2. Remove a media");
		System.out.println("0. Back");
	}
	
	/*
	 * Họ và tên: Phan Thế Anh
	 * MSSV: 20204941
	 * Mã lớp: 721428
	 */
	// The function to add a new media to store
	public static void addToStore() {
		// Check type of media
		System.out.println("Type of media: ");
		System.out.println("1. CD");
		System.out.println("2. DVD");
		System.out.println("3. Book");
		Scanner InputUser = new Scanner(System.in);
		int choose = InputUser.nextInt();
		// Add a DVD
		if (choose == 2) {
			Aims.myStore.addMedia(DigitalVideoDisc.createNewDVD()); // Add to the store
		}
	}
	
}
