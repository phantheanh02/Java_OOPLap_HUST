/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
// Tính số ngày của tháng
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class Days {
	// Hàm kiểm tra chuỗi có phải là số hay không
	public static boolean checkNumber(String s) {
		try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
	}
	
	// Bắt đầu hàm main
	public static void main(String[] args) {
		// Mảng chứa tháng
		String monthArray[] = {"january","february","march","april","may","june","july","august","september","october","november","december"};	
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // Mảng chứa số ngày của tháng của năm không nhuận
		String monthString, yearString; // Khai báo biến mouth và year 
		int month = -1, year = -1;
		
		// Kiểm tra đầu vào
		while (year < 1000 || month <= 0 || month > 12) {
			month = -1;
			// Lấy thông tin tháng từ người dùng
			monthString = JOptionPane.showInputDialog(null,"Please enter month: ","Month",
					JOptionPane.INFORMATION_MESSAGE);
			monthString = monthString.toLowerCase(); // chuyển về chữ thường
			// Lấy thông tin năm từ người dùng
			yearString = JOptionPane.showInputDialog(null,"Please enter year:  ","Year",
					JOptionPane.INFORMATION_MESSAGE);
			// Chuyển tháng sang dạng số
			// Kiểm tra chuỗi có phải số hay không
			if (checkNumber(yearString)) {
				year = Integer.parseInt(yearString); // Nếu đúng thì gắn year = năm;
			}
			else year = -1; // Nếu sai gắn year = -1;
			
			// Kiểm tra chuỗi tháng
			// Nếu chuỗi tháng là số thì biến đổi sang dạng int
			if (checkNumber(monthString)) {
				month = Integer.parseInt(monthString);
			}
			// Nếu sai thì kiểm tra đầu vào dạng chuỗi
			else {
				for (int i = 0; i < monthArray.length; i++) {
					if (monthArray[i].indexOf(monthString) != -1) { // kiểm tra chuỗi có nằm trong mảng tháng hay không
						month = i+1; // Nếu đúng thì gán giá trị month
						break;
					}
				}
			}
		}
		// Kiểm tra có phải là tháng 2 năm nhuận hay không?
		if (month == 2 && year % 4 == 0 && year % 400 == 0) {
				JOptionPane.showMessageDialog(null,29 ,"The number of days", 
						JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, day[month-1],"The number of days", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);		
	}
}
