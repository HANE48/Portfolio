package ex1_work;

import java.util.Scanner;

/*
 * 키보드에서 정수를 입력받고 
 * 입력값이 소수인지 아닌지를 출력
 * 소수: 2, 3, 5, 7, 11, 13, 17
 */

public class Ex2_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), ans = 1;
		
		for(int i = n1 - 1 ; i>1 ; i-- ) {
			if(n1 % i == 0) {
				ans = 0;
				break;
			}else {
				ans = 1;
			}
		}//for
		
		
		if( ans == 1 ) {
			System.out.printf("%d(은)는 소수입니다\n", n1);
		}else {
			System.out.printf("%d(은)는 소수가 아닙니다\n", n1);
		}
		
		System.out.println("---------------------");
		
		int cnt = 0;
		for(int i=2 ; i<=n1 ; i++) {
			if(n1 % i == 0) {		//자기자신으로 나눠졌을 경우만 체크
				cnt++;
			}//if
		}//for
		
		if(cnt == 1) {
			System.out.printf("%d(은)는 소수입니다", n1);
		}else {
			System.out.printf("%d(은)는 소수가 아닙니다.", n1);
		}
		
		
		sc.close();
		
	}//main

}
