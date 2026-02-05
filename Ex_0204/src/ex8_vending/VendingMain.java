package ex8_vending;

import java.util.Scanner;

/*
 * insert coin: 1000
 * coke - 1000
 * fanta - 800
 * orange - 900
 * select: fanta
 * fanta is selected 
 * 잔액 200원을 반환합니다.
 */

public class VendingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr = { {"coke", "1000"},
				{"fanta","800"}, {"orange", "900"}};
		
		System.out.print("insert coin: ");
		Vending v = new Vending(arr, sc.nextInt());
		
		v.printMenu();
		v.selectMenu(sc);
		sc.close();
		
		
	}//main

}
