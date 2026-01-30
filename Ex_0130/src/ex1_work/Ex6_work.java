package ex1_work;

import java.util.Scanner;

/*
 * n1, n2를 입력받아 n1 ~ n2사이의 합을 출력
 * -------------------
 * n1 : 2
 * n2 : 5
 * summary = 14
 */

public class Ex6_work {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = 0;
		
		if(n2 < n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		for(int i=n1 ; i<=n2 ; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		sc.close();
	}//main

}
