package lap02;


public class Cart {
	// Create a field 
	int qtyOrdered = 0;
	// Create size of array
	public static final int MAX_NUMBERS_ORDERED = 20;
	// Create the array itemsOrdered
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	// Create the method addDigitalVideoDisc
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		// Kiểm tra giỏ hàng đã đầy hay chưa
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			// Nếu đầy thì đưa ra thông báo cho người dùng
			System.out.println("Your cart is full!!");
		}
		else {
			// Nếu chưa thì thêm mặt hàng vào giỏ hàng
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}
	 
	// This method will add a list of DVDs to the current cart.
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		if (qtyOrdered + dvdList.length >= MAX_NUMBERS_ORDERED) 
//			System.out.println("Your cart is full!!");
//		else for (int i = 0; i < dvdList.length; i++) {
//			// Nếu chưa thì thêm mặt hàng vào giỏ hàng
//			itemsOrdered[qtyOrdered] = dvdList[i];
//			qtyOrdered++;
//		}
//	}
	
	// allows to pass an arbitrary number of arguments for dvd.
	public void addDigitalVideoDisc(DigitalVideoDisc ... disc ) {
		if (qtyOrdered + disc.length >= MAX_NUMBERS_ORDERED) 
			System.out.println("Your cart is full!!");
		else for (int i = 0; i < disc.length; i++) {
			// Nếu chưa thì thêm mặt hàng vào giỏ hàng
			itemsOrdered[qtyOrdered] = disc[i];
			qtyOrdered++;
		}
	}
	
	// Overloading by differing the number of parameters
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 >= MAX_NUMBERS_ORDERED) 
			System.out.println("Your cart is full!!");
		else  {
			// Nếu chưa thì thêm mặt hàng vào giỏ hàng
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
		}
	}
	
	// Create the method removeDigitalVideoDisc
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		// Tìm kiếm phần tử cần xóa
		for (int i = 0; i < qtyOrdered; i++) 
			// Ghi đè các phần tử sau vào phần tử trước
			if (itemsOrdered[i] == disc) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				break;
			}
		qtyOrdered--; // Giảm số mặt hàng trong giỏ hàng
	}
	
	// Create the method totalCost
	public float totalCost() {
		//System.out.println("Total cost:");
		float sum = 0; // Total cost
		for (int i = 0; i < qtyOrdered; i++)
			sum += itemsOrdered[i].getCost();
		return sum;
	}
	
	// The method toString
	
	// Create the method listCart
	public void listCart() {
		System.out.println("************************CART************************");
		System.out.println("Cac mat hang da dat hang:");
		for (int i = 0; i < qtyOrdered; i++) 
			System.out.println(i+1 + ". DVD - " +itemsOrdered[i]);
		System.out.println("Tong chi phi: " + totalCost());
		System.out.println("****************************************************");
	}
	
	// Search for DVDs in the cart by ID and display the search results
	public void searchID(int ID) {
		for (int i = 0; i < qtyOrdered; i++) 
			if (itemsOrdered[i].getId() == ID) {
				System.out.println(itemsOrdered[i]);
				return;
			}
		System.out.println("No found!!");
	}
	
	// Search for DVDs in the cart by title
	public void searchTitle(String title) {
		// Check title = ""
		if (title == "") {
			System.out.println("Please enter title!!");
			return;
		}
		boolean check = false; // to check found
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println(itemsOrdered[i]); // Print if found
				check = true; // is Found
			}
		}
		// Not found
		if (!check) 
			System.out.println("No found!!");
	}
	
}
