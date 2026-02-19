package ex2_fileReader;

import java.io.FileReader;

public class Ex1_fileMain {

	public static void main(String[] args) {
		String path = "D:/Java_KWH/work.txt";
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			int code = 0;
			
			while((code=fr.read()) != -1) {	
				System.out.print( (char)code );
			}
			
		}catch (Exception e) {
					
		}finally {
			if(fr != null) {
				try {
					fr.close();
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		
		
	}//main

}
