package ex8_work;

import java.util.Scanner;

/*
 * 키보드에서 문장을 받아
 * 각 스펠링의 갯수를 출력
 * ---------------
 * abcabca
 * a3b2c2
 */

public class Ex2_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex2_class e = new Ex2_class();
		String s = sc.next();
		
		System.out.println(e.chk(s));
		
		sc.close();
		
	}//main

}
