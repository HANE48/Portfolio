package ex2_fileReader;

import java.io.FileReader;
import java.io.IOException;

public class Ex2_fileReader {

	public static void main(String[] args) throws IOException{
		String path = "D:/Java_KWH/work.txt";
		//문서에 대한 대문자의 갯수와 소문자의 갯수 출력
		
		FileReader fr = new FileReader(path);
		int code;
		int cntA = 0;
		int cnta = 0;
		
		while((code=fr.read()) != -1) {
			if(code>='A' && code<='Z') {
				cntA++;
			}
			if(code>='a' && code<='z') {
				cnta++;
			}
		}
		
		System.out.println("대문자: " + cntA);
		System.out.println("소문자: " + cnta);
		fr.close();
		
	}//main
	
}
