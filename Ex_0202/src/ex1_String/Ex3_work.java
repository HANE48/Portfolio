package ex1_String;

import java.util.Scanner;

/*
 * 키보드에서 아무 값이나 입력받아 
 * 입력받은 값에서 소문자 a의 갯수를 출력
 * --------------------------
 * asdgqwe
 * 1
 */

public class Ex3_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int chk = 0;
		
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == 'a') {
				chk++;
			}
		}
		
		System.out.println(chk);
		sc.close();
	}//main

}
