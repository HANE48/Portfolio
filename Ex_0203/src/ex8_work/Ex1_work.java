package ex8_work;

import java.util.Scanner;

/*
 * 다음과 같이 문장을 입력받고 연속된 중복 문자의 갯수를 카운트
 * ----------------------------------------
 * 값: aabbaba
 * 결과: a2b2a1b1a1
 */


public class Ex1_work {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Ex1_class e = new Ex1_class();
		String s = sc.next();
		
		System.out.println(e.chkStr(s));
		
		sc.close();
		
	}//main

}
