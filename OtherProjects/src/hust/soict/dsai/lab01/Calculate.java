/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
// Example 6: Calculate.java
// 2.2.5 Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class Calculate {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		String strNum1, strNum2;
		// Lấy số đầu tiên từ bàn phím
		strNum1 = JOptionPane.showInputDialog(null,"Nhập số đầu tiên: ","Số đầu tiên",
				JOptionPane.INFORMATION_MESSAGE);
		// Lấy số thứ 2 từ bàn phím 
		strNum2 = JOptionPane.showInputDialog(null,"Nhập số thứ hai:  ","Số thứ hai",
				JOptionPane.INFORMATION_MESSAGE);
		// Chuyển đổi chuỗi thành số
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		// Tổng hai số
		JOptionPane.showMessageDialog(null, num1+num2,"Tổng 2 số", 
				JOptionPane.INFORMATION_MESSAGE);
		// Hiệu hai số
		JOptionPane.showMessageDialog(null, num1-num2,"Hiệu 2 số", 
				JOptionPane.INFORMATION_MESSAGE);
		// Tích hai số
		JOptionPane.showMessageDialog(null, num1*num2,"Tích 2 số", 
				JOptionPane.INFORMATION_MESSAGE);
		// Thương hai số
		JOptionPane.showMessageDialog(null, num1/num2,"Thương 2 số", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);	
	} // Kết thúc hàm main
}
