/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 */
package hust.soict.dsai.aims.media;
public class Track implements Playable{
	// Create attribute
	private String title;
	private int length;
	
	// Create constructor
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	/*
	 * Họ và tên: Phan Thế Anh
	 * MSSV: 20204941
	 * Mã lớp: 721428
	 */
	// override equals method
	@Override
	public boolean equals(Object o) {
		if (o instanceof Track) { // // Check If the passing object is not an instance of Track
			return ((Track) o).getTitle() == this.getTitle() && 
					((Track) o).getLength() == this.getLength(); // Compare two object
		}
		return false;
	}
	// Create getter and setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		// Inform title and length Track
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	
	}

}
