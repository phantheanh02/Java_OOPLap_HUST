/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * EXample 6: The second-degree equation with one variable
 * ax^2 + bx + c = 0;
 * 27/10/2022
 */
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class SeconDegreEquationOneVar {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;
		// Lấy a, b, c từ bàn phím
		strNum1 = JOptionPane.showInputDialog(null,"Please enter a11: ","Input a11",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,"Please enter a12:  ","Input a12",
				JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null,"Please enter b1:  ","Input b1",
				JOptionPane.INFORMATION_MESSAGE);
		// Đổi string sang double
		double a = Double.parseDouble(strNum1);	// a
		double b = Double.parseDouble(strNum2); // b
		double c = Double.parseDouble(strNum3); // c
		
		// Tính denta
		double denta = b*b - 4*a*c; 
		// Tìm nghiệm của PT
		// Trường hợp vô nghiệm
		if (denta < 0) {
			JOptionPane.showMessageDialog(null, "PT vo nghiem","Result", 
					JOptionPane.INFORMATION_MESSAGE);
		} 
		// Trường hợp nghiệm kép
		else if (denta == 0) {
			JOptionPane.showMessageDialog(null, "PT co nghiem kep: "+ -b/2/a,"Result", 
					JOptionPane.INFORMATION_MESSAGE);
		} 
		// Trường hợp nghiệm đơn
		else {
			JOptionPane.showMessageDialog(null, "x1 = " + (-b + Math.sqrt(denta))/2/a + "\nx2 = " + (-b - Math.sqrt(denta))/2/a ,"Result", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	} // Kết thúc hàm main
}
