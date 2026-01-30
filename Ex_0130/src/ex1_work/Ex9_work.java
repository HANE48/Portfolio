package ex1_work;

import java.util.Scanner;

/*
 * 키보드로 값을 입력받아 소수인지 아닌지 판단하기
 * -------------------------------
 * 4
 * 4(은)는 소수가 아닙니다.
 */

public class Ex9_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=2 ; i<n ; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.print(n + "(은)는 소수입니다.");
		}else{
			System.out.print(n+"(은)는 소수가 아닙니다.");
		}
		sc.close();
	}//main

}
