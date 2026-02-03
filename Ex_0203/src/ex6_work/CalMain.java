package ex6_work;

import java.util.Scanner;

/*
 * 키보드에서 숫자 2개와 연산 기호를 입력받아 계산기 만들기
 * 조건 1) 키보드에서 숫자 2개 연산자를 입력받는 코드는 main에서 
 * 조건 2) 숫자 2개 연산자를 판단하여 최종 결과를 반환하는 클래스는 Calc에서 
 * 조건 3) 최종 연산결과의 출력은 main에서 한다.
 * 조건 4) 연산기호가 잘못되었다면 '잘못된 연산자' 라는 메시지와 함께 -1을 반환
 */

public class CalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc c = new Calc();
		
		System.out.print("숫자1:");
		int n1 = sc.nextInt();
		System.out.print("숫자1:");
		int n2 = sc.nextInt();
		System.out.print("연산자:");
		String operater = sc.next();
		
		int ans = c.Calculator(n1, n2, operater);
		
		if(ans == -1 && !operater.equals("-")) {
			System.exit(0);
		}
		
		System.out.println(ans);
		
		
		sc.close();
	}//main

}
