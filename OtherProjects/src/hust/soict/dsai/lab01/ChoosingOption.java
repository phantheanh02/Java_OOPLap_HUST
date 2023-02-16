/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
// Exercises 6.1: 6.1	Write, compile and run the ChoosingOption program
// 	Đưa ra cửa sổ để người dùng chọn
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		// Đưa ra thông báo để người dùng chọn
		int option = JOptionPane.showConfirmDialog(null,
				"Do you want to change to the first class ticket?");
		// In ra màn hình lựa chọn của người dùng
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option ==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0); // Thoát chương trình
	} // Kết thúc hàm main
}
