package ex5_work;

import java.util.Scanner;

/*
 * 피보나치 수열 만들기
 * 키보드로 값을 입력받고 그 숫자(횟수)만큼만 값을 출력
 * ------------------------------
 * 값: 5 
 * 1 1 2 3 5
 */

public class Ex2_wok {
	
	public static void main(String[] args) {		//1 1 2 3 5 8 13 21 35
		int n, i=1, j=0, n3=0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int k=0 ; k<n ; k++) {
//			if(k<=1) {
//				System.out.print(1 + " ");
//			}else {
//				int next = i + j;
//				System.out.print(next + " ");
//				i = j;
//				j = next;
//			}
			j = n3;
			n3 = i;
			i = j + n3;
			System.out.print(n3 + " ");
			
		}//for
		
		sc.close();
		
	}//main

}
