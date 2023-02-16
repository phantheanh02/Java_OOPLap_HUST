/*
 * Họ và tên: Phan Thế Anh
 * MSSV: 20204941
 * Mã lớp: 721428
 * Class: NoGarbage
 */
package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "D:\\testFp.text"; // file text
		byte[] inputBytes = {0}; 
		long startTime = 0, endTime = 0 ; // Set time begin and time end
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis(); // Get time begin
		String outputString = "";
		StringBuilder output = new StringBuilder(); // String Builder
		// The loop to concat string
		for (byte b : inputBytes) 
			output.append((char)b);
		outputString = output.toString();
		endTime = System.currentTimeMillis(); // Get time end
		System.out.println(endTime - startTime);

	}
}
