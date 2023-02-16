/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Class: ConcatenationInLoops
 */

package hust.soict.dsai.garbage;
import java.awt.SystemColor;
import java.util.Random;

public class ConcatenationInLoops {
	// Begin main
	public static void main(String[] args) {
		Random r = new Random(123); // Creat object random
		long start = System.currentTimeMillis(); // get time start
		String s = "";
		// The loop concat string
		for (int i = 0; i < 65536; i++) 
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start); // Print total time run 

		r = new Random(123); 
		start = System.currentTimeMillis(); // get time start
		StringBuilder sb = new StringBuilder(); // Create object StringBuilder
		// The loop concat string
		for (int i = 0; i < 65536; i++) 
			sb.append(r.nextInt(2));
		s = sb.toString();
		System.out.println(System.currentTimeMillis() - start); // print total time run
	}
}
