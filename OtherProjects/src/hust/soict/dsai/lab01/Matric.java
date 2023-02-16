/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * 27/10/2022
 */
// Bài 6.6: Cộng hai ma trận cùng kích thước
package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class Matric {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Thông báo nhập số dòng và cột của ma trận
		System.out.println("Nhap so dong va cot cua ma tran: ");
		int n = input.nextInt(); // Số dòng của ma trận
		int m = input.nextInt(); // Số cộtt của ma trận
		int matric1[][] = new int[n][m];
		int matric2[][] = new int[n][m];
		// Nhập ma trân thứ nhất
		System.out.println("Nhap ma tran dau tien");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matric1[i][j] = input.nextInt();
			}
		}
		// Nhập ma trận thứ hai
		System.out.println("Nhap ma tran thu hai");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matric2[i][j] = input.nextInt();
			}
		}
		
		// Cộng hai ma trận
		System.out.println("Cong hai ma tran");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matric1[i][j] += matric2[i][j];
			}
		}
		
		// In ra màn hình
		for (int[] innerArray: matric1) {
            //vòng lặp for-each truy cập đến từng phần tử trong các dòng
            for(int data: innerArray) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
		System.exit(0);
	}
}
