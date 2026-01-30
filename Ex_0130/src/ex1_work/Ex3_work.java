package ex1_work;

import java.util.Scanner;

//계산기 만들기

public class Ex3_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1: ");
		double n1 = sc.nextDouble();
		
		System.out.print("num2: ");
		double n2 = sc.nextDouble();
		
		System.out.print("operand: ");
		String op = sc.next();
		
		double sum = 0;
		
		switch(op) {
		case "+":
			sum = n1 + n2;
			break;
		case "-":
			sum = n1 - n2;
			break;
		case "/":
			sum = n1 / n2;
			break;
		case "*":
			sum = n1 * n2;
			break;
		}
		
		System.out.println(n1 + " " + op + " " + n2 + " = " + sum);
		sc.close();
		
	}//main

}
