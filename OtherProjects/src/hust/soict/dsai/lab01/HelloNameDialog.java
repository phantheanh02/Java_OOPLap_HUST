/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
//  Example 3: HelloNameDialog.java
// Lấy tên người dùng và in ra lời chào
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class HelloNameDialog {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		String result; // Biến thông báo người dùng nhập tên
		result = JOptionPane.showInputDialog("Please enter your name:"); // Đưa ra thông báo
		JOptionPane.showMessageDialog(null,"Hi "+ result +"!"); // Đưa ra lời chào
		System.exit(0);;
	} // Kết thúc hàm main
}
