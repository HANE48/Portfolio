package ex5_work;

import java.util.Scanner;

/*
 	키보드에서 정수 두개, 연산자를 입력받아 아래와 같은 결과를 만드시오
 	---------------------------
 	숫자1: 11
 	숫자2: 20
 	연산자: +
 	11 + 20 = 31
 	
 */

public class Ex1_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum = 0;
		String calc;
		
		System.out.print("숫자1:");
		n1 = sc.nextInt();
		System.out.print("숫자2:");
		n2 = sc.nextInt();
		System.out.print("연산자:");
		calc = sc.next();
		
		switch(calc) {
		case "+":
			sum = n1 + n2;
			System.out.printf("%d + %d = %d", n1, n2, sum);
			break;
		case "-":
			sum = n1 - n2;
			System.out.printf("%d - %d = %d", n1, n2, sum);
			break;
		case "*":
			sum = n1 * n2;
			System.out.printf("%d * %d = %d", n1, n2, sum);
			break;
		case "/":
			float ssum = (float)n1/(float)n2;
			System.out.printf("%d / %d = %.1f", n1, n2, ssum);
			break;
		case "^":
			int n22 = n2;
			while(n2>0) {
				sum += n1 * n1;
				n2--;
			}
			System.out.printf("%d ^ %d = %d", n1, n22, sum);
			break;
		default:
			System.out.println("올바른 값 또는 연산자를 입력해주세요.");
			break;
		}
		
		sc.close();
		
		
				
	}//main

}
