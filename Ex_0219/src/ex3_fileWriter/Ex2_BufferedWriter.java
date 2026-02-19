package ex3_fileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2_BufferedWriter {

	public static void main(String[] args) throws IOException {
		String path = "D:/Java_KWH/fileWriter.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			String msg = "i'm buffered Writer";
			
			bw.write(msg);
			
		} catch (Exception e) {
		
		}finally {
			bw.flush();
			bw.close();
			fw.close();
		}
		
		
	}

}
