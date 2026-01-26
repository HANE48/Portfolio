package ex1_contorlStatement;

import java.util.Scanner;

/*
 	키보드에서 정수 n의 값을 입력받음
 	1부터 n까지의 합을 계산해서 출력
 	입력: 10
 	출력: 55
 */

public class Ex4_single_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum=0;
		
		for(int i=0 ; i<n ; i++) {
			sum += i+1;
		}
		System.out.println(sum);
		sc.close();
	}//main

}
