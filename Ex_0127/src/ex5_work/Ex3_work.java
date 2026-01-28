package ex5_work;

import java.util.Scanner;

/*
 * 키보드에서 숫자 두개를 입력받아,
 * 숫자 두 개의 최소공배수를 구하기
 * ---------------------
 * 2 5
 * 10
 * ---------------------
 * 4 6 
 * 12
 * ---------------------
 * 6 10
 * 30
 * ---------------------
 * 3 3
 * 1
 * ---------------------
 */

public class Ex3_work {

	public static int gcd(int n1, int n2) {
		if(n1%n2==0) {
			return n2;
		}
		else {
			return gcd(n2, n1%n2);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n2>n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println(n1*n2/gcd(n1,n2));
		
		for(int i=1 ; i<= n1 * n2 ; i++) {
			
			if(i % n1 == 0 && i % n2 ==0) {
				System.out.println(i);
				break;
			}
			
		}
		
		
		sc.close();
	}//main

}
