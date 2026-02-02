package ex1_String;

import java.util.Scanner;

/*
 * 키보드에서 입력받은 문자열의 홀수번째 위치의 문자만 추출하기
 */

public class Ex5_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0 ; i<str.length() ; i++) {
			if((i+1)%2 == 0) {
				continue;
			}
			System.out.print(str.charAt(i));
		}
		
		sc.close();
		
	}//main

}
