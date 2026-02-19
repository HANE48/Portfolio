package ex3_fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {

	public static void main(String[] args) throws IOException {
		String path = "D:/Java_KWH/fileWriter.txt";
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(path);
			String str = "나는 fileWriter의 예제입니다";
			
			fw.write(str);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			fw.flush();
			fw.close();
		}
		
		
	}//main

}
