package boj24267;

/*
 * MenOfPassion(A[], n) {
 * 	sum <- 0;
 * 	for i <- 1 to n - 2
 * 		for j <- i + 1 to n - 1
 * 			for k <- j + 1 to n
 * 				sum <- sum + A[i] × A[j] × A[k]; # 코드1
 * 	return sum;
 * 	}
 * 
 * 위 코드에서 코드1의 실행횟수 계산하기
 * (n^3 -3n^2 + 2n) / 6
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println( n*(n-1)*(n-2)/ 6);
		System.out.println("3");
		sc.close();
		
	}//main

}
