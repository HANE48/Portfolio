package ex2_work;

import java.util.Scanner;

/*
 * 두 수를 입력받아 최대공약수 구하기
 */

public class WorkMain {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Work w = new Work();
		System.out.println(w.GCD(sc.nextInt(), sc.nextInt()));
		sc.close();
	}//main

}
