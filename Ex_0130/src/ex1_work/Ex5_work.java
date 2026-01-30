package ex1_work;

import java.util.Scanner;

/*
 * 키보드에서 숫자를 입력받에 그 숫자에 해당하는 구구단 출력
 */

public class Ex5_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(n + " * " + (i+1) + " = " + (n*(i+1)) + "\n");
		}
		
		sc.close();
		
	}//main

}
