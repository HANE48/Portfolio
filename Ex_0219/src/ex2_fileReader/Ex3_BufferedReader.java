package ex2_fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3_BufferedReader {

	public static void main(String[] args) throws IOException{
		String path = "D:/Java_KWH/work.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String msg = "";
			
			while((msg = br.readLine()) != null) {
				
				System.out.println(msg);
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(br != null) {
				br.close();
			}
			if(fr != null) {
				fr.close();
			}
		}
		
		
		
	}//main

}
