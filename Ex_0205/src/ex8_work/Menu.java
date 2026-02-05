package ex8_work;

import java.util.Scanner;

public class Menu {
	
	public int getMenu(Scanner sc) {
		System.out.println("1. 관광객 정보");
		System.out.println("2. 목적지 변경");
		System.out.println("3. 종    료");
		System.out.print(">>");
		int n = sc.nextInt();
		return n;
	}
	
}
