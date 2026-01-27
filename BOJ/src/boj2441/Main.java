package boj2441;

import java.util.Scanner;

/*
	첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
	하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, star, space;
		n = sc.nextInt();
		
		star = n;
		space = 0;
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<space ; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<star ; j++) {
				System.out.print("*");
			}
			star--;
			space++;
			System.out.println();
		}
		sc.close();
	}//main
}
