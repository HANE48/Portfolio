package ex1_work;

import java.util.Scanner;

public class Menu {
	public int getMenu(Scanner sc) {
		System.out.println("1. 입  금");
		System.out.println("2. 출  금");
		System.out.println("3. 잔액확인");
		System.out.println("4. 종  료");
		System.out.print(">>");
		int n = sc.nextInt();
		return n;
		
	}
}
