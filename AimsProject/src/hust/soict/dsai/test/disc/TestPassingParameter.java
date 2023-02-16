/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Class: TestPassingParameter
 */
package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// Creat new two òbject
		DigitalVideoDisc jungLeDVD = new DigitalVideoDisc("JungLe");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		// Method swap
		swap(jungLeDVD, cinderellaDVD);
		// Print result
		System.out.println("jungle dvd title: " + jungLeDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

//		changeTitle(jungLeDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungLeDVD.getTitle());

	} 

	// swap() method that can correctly swap the two objects
	public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		String oldTitle = o1.getTitle();
		o1.setTitle(o2.getTitle());
		o2.setTitle(oldTitle);
	}
	
	// Create method to change title
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);	
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
