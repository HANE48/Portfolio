package ex2_work;

import java.util.Scanner;

/*
 * 키보드에서 입력받은 값에 대해 중복값을 제거한 결과를 출력
 * -------------------------------------
 * aaabbacc
 * abc
 */

public class Ex2_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[123];
		String s = "";
		
		for(int i=0 ; i<str.length() ; i++) {
			if(arr[str.charAt(i)] == 0) {
				arr[str.charAt(i)]++;
				s += str.charAt(i);
			}
		}
		
		System.out.println(s);
		sc.close();
		
	}//main

}
