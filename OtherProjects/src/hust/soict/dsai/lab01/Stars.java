/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
// Exercises 6.4: Write a program to display a triangle with a height of n stars (*), n is entered by users.

package hust.soict.dsai.lab01;
import java.util.Scanner; // import thư viện
public class Stars {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		Scanner starsScanner = new Scanner(System.in); // Khởi tạo đối tượng 
		System.out.print("Please enter n: "); // Thông báo người dùng nhập n
		int n = starsScanner.nextInt(); // gán n = số của người dùng nhập vào
		
		// Vòng lặp tạo tháp sao
		for (int i = 0; i < n; i++) {
			// Tạo cách đầu dòng
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			// Tạo sao
			for (int j = 0; j <= i*2; j++) {
				System.out.print("*");
			}
			// Xuống dòng
			System.out.println();
		}
		System.exit(0);
	}
}
