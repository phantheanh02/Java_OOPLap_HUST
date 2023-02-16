/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Example 6:	Write a program to solve
 * -	The system of first-degree equations (linear system) with two variables
 * a_11 * x_1 + a_12 * x_2 = b_1  
 * a_21 * x_1 + a_22 * x_2 = b_2  
 * 27/10/2022
 */
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class FirstDegreeEquationsTwoVar {
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;
		// Lấy a11, a12, b1 từ bàn phím
		strNum1 = JOptionPane.showInputDialog(null,"Please enter a11: ","Input a11",JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,"Please enter a12:  ","Input a12",JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null,"Please enter b1:  ","Input b1",JOptionPane.INFORMATION_MESSAGE);
		// Đổi string sang double
		double a11 = Double.parseDouble(strNum1);	// a11
		double a12 = Double.parseDouble(strNum2);	// a12
		double b1 = Double.parseDouble(strNum3);	// b1
		
		// Lấy a21, a22, b2 từ bàn phím
		strNum1 = JOptionPane.showInputDialog(null,"Please enter a21: ","Input a21",JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,"Please enter a22:  ","Input a22",JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null,"Please enter b2:  ","Input b2",JOptionPane.INFORMATION_MESSAGE);
		// Đổi string sang double
		double a21 = Double.parseDouble(strNum1);	// a21
		double a22 = Double.parseDouble(strNum2);	// a22
		double b2 = Double.parseDouble(strNum3);	// b2
		
		// Kiểm tra sự có nghiệm có của PT
		// PT vô nghiệm
		if ( a11/a21 == a12/a22 && a12/a22 != b1/b2  ) {
			JOptionPane.showMessageDialog(null, "PT vo nghiem","Result", JOptionPane.INFORMATION_MESSAGE);
		}
		// PT vô số nghiệm
		else if ( a11/a21 == a12/a22 && a12/a22 == b1/b2 ) {
			JOptionPane.showMessageDialog(null, "PT vo so nghiem","Result",JOptionPane.INFORMATION_MESSAGE);
		}
		// PT có nghiệm
		else {
			double y = (b2+a12/a11/a11*b1)/(a22-a21/a11/a11*a12); // Nghiêm x1
			JOptionPane.showMessageDialog(null, "x1 = " + y + "\nx2 = " + (b1-a12*y)/a11  ,"Result", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	} // Kết thúc hàm main
}
