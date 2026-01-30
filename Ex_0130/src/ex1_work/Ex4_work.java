package ex1_work;

import java.util.Scanner;

/*
 * 키보드로 숫자를 입력받아 
 * 1 ~ 입력받은 숫자까지 반복중
 * 홀수의 합을 계산하여 출력
 */

public class Ex4_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), sum=0;
		
		for(int i=0 ; i<n ; i++) {
			if(n%2 != 0) {
				sum+=i+1;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}//main

}
