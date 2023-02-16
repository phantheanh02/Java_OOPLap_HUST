/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
// Bài 6.5: Sắp xếp mảng và tính tổng, giá trị trung bình của mảng đó
package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class SortThenSumAndAvg {
	// Bắt đầu hàm main
	public static void main(String[] args) {
		int sum = 0; // Tổng mảng
		// Lấy số phần tử của mảng
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = input.nextInt(); // Số phần tử của mảng
		// Tạo mảng 
		int NUMBERS[] = new  int[n];
		// Nhập các số từ bàn phím
		System.out.printf("Nhap cac phan tu : \n");
		for ( int i = 0; i < n; i++) {
			NUMBERS[i] = input.nextInt();
			sum+= NUMBERS[i]; // Tính tổng của mảng
		}
		// Sắp xếp mảng theo thứ tự tăng dần
		int arr1[] = Arrays.copyOf(NUMBERS, NUMBERS.length);
        Arrays.sort(arr1); // Sắp xếp mảng
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr1)); // In ra màn hình
        // In ra tổng của mảng
        System.out.println("Tong cac phan tu: " + sum);
        // In ra giá trị trung bình
        System.out.println("Gia tri trung binh: " + sum/n);
        
        System.exit(0);
	} // Kết thúc hàm main
}
