/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Example 6:	Write a program to solve
 * -	The first-degree equation (linear equation) with one variable
 * ax + b = 0;
 * 27/10/2022
 */
package hust.soict.dsai.lab01;
import java.util.Scanner;
import javax.swing.*;
public class FirstDegreeEquation {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		// Khai báo 2 chuỗi để lấy dữ liệu từ người dùng
		String strNum1, strNum2;
		// Lấy 2 số dạng chuỗi từ bàn phím
		strNum1 = JOptionPane.showInputDialog(null,"Please enter a: ","Input a",
				JOptionPane.INFORMATION_MESSAGE); // Lấy a
		strNum2 = JOptionPane.showInputDialog(null,"Please enter b:  ","Input b",
				JOptionPane.INFORMATION_MESSAGE); // lấy b
		// Chuyển đổi string sang double
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		// Kiểm tra các trường hợp
		// Trường hợp vô số nghiệm
		if (num1 == 0 && num2 == 0) {
			JOptionPane.showMessageDialog(null,"PT vo so nghiem","Result", 
					JOptionPane.INFORMATION_MESSAGE); // In ra kết quả vô số nghiệm
		}
		// Trường hợp vô nghiệm
		else if (num1 == 0 && num2 != 0) {
			JOptionPane.showMessageDialog(null, "PT vo nghiem","Result", 
					JOptionPane.INFORMATION_MESSAGE); // In ra kết quả vô nghiệm
		}
		// Trường hợp PT có nghiệm
		else {
			JOptionPane.showMessageDialog(null, -num2/num1 ,"Result", 
					JOptionPane.INFORMATION_MESSAGE); // In ra kết quả
		}
		System.exit(0);
	} // Kết thúc hàm main
}
