package ex1_work;

import java.util.Scanner;

/*
 * 키보드에서 숫자 두개를 입력받아, 
 * 입력받은 두 수의 최소공배수 구하기
 * 
 * 키보드에서 값을 받는 부분은 main에서 진행
 * 값을 전달받아서 최소공배수를 판단하는 코드를 Work클래스에서 진행
 */

public class WorkMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Work w = new Work();
		
		if(n<m) {
			int temp = n;
			n = m;
			m = temp;	
		}
		System.out.println(n*m/w.GCD(n,m));
		sc.close();
		
	}
}
