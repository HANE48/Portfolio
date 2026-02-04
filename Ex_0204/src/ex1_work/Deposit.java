package ex1_work;

import java.util.Scanner;

public class Deposit {
	public int deposit(Scanner sc) {
		System.out.println("--입   금--");
		System.out.print("입금액: ");
		int n = sc.nextInt();
		System.out.println("입금 성공");	
		return n;
	}//deposit
	
	
}
