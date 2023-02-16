/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
//  Example 5: ShowTwoNumber.java
// In ra màn hình 2 số của người dùng nhập vào
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	// Bát đầu hàm main
	public static void main(String[] args) {
		// Khởi tạo biến
		String strNum1, strNum2;
		String strNotification = "You've just entered: "; // Thông báo kết quả
		// Lấy số thứ nhất
		strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and "; // Nối số thứ nhất vào chuỗi cần in
		// Lấy số thứ hai
		strNum2 = JOptionPane.showInputDialog(null,"Please input the second number:","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2; // Nối số thứ 2 vào chuỗi
		// In ra kết quả
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	} // Kết thúc hàm main
}
