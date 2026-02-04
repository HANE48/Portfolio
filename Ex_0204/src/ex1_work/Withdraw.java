package ex1_work;

import java.util.Scanner;

public class Withdraw {
	
	public int withdraw(Scanner sc, int acc) {
		System.out.println("--출   금--");
		System.out.print("출금액: ");
		int n = sc.nextInt();
		
		if(acc<n) {
			System.out.println("잔액 부족");
			return acc;
		}else {
			System.out.println("출금 성공");
			return acc-n;
		}
		
	}
	
	
}
