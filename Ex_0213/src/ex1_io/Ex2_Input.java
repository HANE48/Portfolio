package ex1_io;

import java.io.IOException;
import java.util.Scanner;

public class Ex2_Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte[] read = new byte[100];
		
		System.out.print("값: ");
		try {
			//표준 입력장치의 값을 받는 System.in 스트림을 사용
			System.in.read( read );
			
			String res = new String(read);
			System.out.println(res.trim());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}//main

}
