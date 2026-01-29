package ex4_work;

import java.util.Scanner;

/*
 * 피보나치 수열을 배열로 만드세요
 * --------------------
 * 6
 * 1 1 2 3 5 8 
 * 0 1 2 3 4 5
 */

public class Ex2_work {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] fib = new int[n];
		fib[0] = 1;
		fib[1] = 1;
		
		for(int i=2 ; i<fib.length ; i++) {
			fib[i] = fib[i-2]+fib[i-1];
		}			
		
		
		for(int i=0 ; i<fib.length ; i++) {
			System.out.print(fib[i] + " ");
		}//for
		
		System.out.println();
		
		//enhanced for
		for(int i:fib) {		//i에다가 fib[0]값부터 참조함
			System.out.print(i + " ");	//fib에 i를 넣으며 출력
		}
		
		
		System.out.println("\n------------------------");
		
		int[] fib2 = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			fib2[i] = (i<2) ? 1 : fib2[i-2]+fib2[i-1];
			System.out.print(fib2[i] + " ");
		}
		
		
		sc.close();
	}//main

}
