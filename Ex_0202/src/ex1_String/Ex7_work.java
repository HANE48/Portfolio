package ex1_String;

import java.util.Scanner;

/*
 * 키보드에서 입력받은 값을 암호화 하여 출력
 * --------------------------
 * 입력 : abc123
 * 결과 : `~!wer
 */


public class Ex7_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] pwd = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
					'(', ')', '-', '_', '+','=', '|', '[', ']', '{', '}', ':',
					':', ',', '.', '/', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		
		String str = sc.next();
		
		
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				str = str.replace(str.charAt(i), pwd[str.charAt(i) - 'a']);
			}
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				str = str.replace(str.charAt(i), pwd[(str.charAt(i) - '0') + 26]);
			}
		}
		
		System.out.println(str);
		
		sc.close();
	}//main

}
