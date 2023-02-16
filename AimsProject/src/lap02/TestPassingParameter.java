package lap02;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungLeDVD = new DigitalVideoDisc("JungLe");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungLeDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungLeDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
/*
		changeTitle(jungLeDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungLeDVD.getTitle());
*/	
	} 

	// swap() method that can correctly swap the two objects
	public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		String oldTitle = o1.getTitle();
		o1.setTitle(o2.getTitle());
		o2.setTitle(oldTitle);
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		dvd.setTitle(title);	
	}
}
