/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Class: DigitalVideoDisc
 */
package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	// Create attributes
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	// Create class attribute
	private static int nbDigitalVideoDiscs = 0;

	// Create method to update id & nbDigitalVideoDiscs
	private void newObject() {
		nbDigitalVideoDiscs++; // increase nbDigitalVideoDiscs
		this.id = nbDigitalVideoDiscs; // id = nbDigitalVideoDiscs
	}
	// Create Constructor methods
	// Default
	public DigitalVideoDisc() {
		newObject();
	}
	// By title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		newObject();
	}
	// By category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		newObject();
	}
	// By director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		newObject();
	}
	// By all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		newObject();
	}
	
	
	@Override
	// Rewrite method toString
	public String toString() {
		return title + " - " + category + " - " + director + " - " + length + " - " + cost;
	}
	
	// finds out if the corresponding disk is a match given the title. 
	public boolean isMatch(String titLe) {
		return this.title.contains(titLe); // Check title
	}
	
	// Create accessors and mutators 
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public float getCost() {
			return cost;
		}
		public void setCost(float cost) {
			this.cost = cost;
		}
}

