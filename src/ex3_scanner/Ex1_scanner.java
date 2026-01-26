package ex3_scanner;

import java.util.Scanner;

/*
 	Scanner 키보드에서 값을 입력받기 위한 클래스
 */

public class Ex1_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int n = sc.nextInt();
		System.out.println("입력받은 정수: " + n);
		
		System.out.print("정수2: ");
		int n2 = sc.nextInt();
		System.out.println("두번째 수: " + n2);
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.println("name is : " + name);
		
		
		
		
		sc.close();
		
	}//main

}
