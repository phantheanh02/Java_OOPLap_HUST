
/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
// Exercises 6.2:6.2	Write a program for input/output from keyboard
package hust.soict.dsai.lab01;
import java.util.Scanner; // import thư viện
public class InputFromKeyboard {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		// Khai báo đối tượng keyboad 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?"); // Thông báo câu hỏi
		String strName = keyboard.nextLine(); // Lấy tên từ người dùng
		System.out.println("How old are you?"); // Thông báo câu hỏi
		int iAge = keyboard.nextInt(); // Lấy tuổi từ người dùng
		System.out.println("How tall are you (m)?"); // Thông báo câu hỏi
		double dHeight = keyboard.nextDouble(); // Lấy chiều cao từ người dùng
		
		// Similar to other data types
		// nextByte(), nextShort(),...
		// In ra màn hình thông tin của người dùng nhập vào
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " 
				+ "Your height is " + dHeight + "."); // In thông tin
	} // Kết thúc hàm main
}
