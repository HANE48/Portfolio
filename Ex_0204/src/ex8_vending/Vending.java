package ex8_vending;

import java.util.Scanner;

public class Vending {
	private String[][] str;
	private int coin;
	
	public Vending(String[][] str, int coin) {
		this.str = str;
		this.coin = coin;
	}
	
	public void printMenu() {
		for(int i=0 ; i<str.length ; i++) {
			if(Integer.parseInt(str[i][1]) > coin) {
				continue;
			}
			System.out.println(str[i][0] + " - " + str[i][1]);
			
		}
	}
	
	public void selectMenu(Scanner sc) {
		
		System.out.print("음료를 선택해주세요: ");
		String s = sc.next();
		System.out.println(s + "(이)가 선택되었습니다.");
		
		for(int i=0 ; i<str.length ; i++) {
			if(str[i][0].equalsIgnoreCase(s)) {
				coin -= Integer.parseInt(str[i][1]);
			}
		}
		
		System.out.println("잔돈 " + coin + "원을 반환합니다");
	}

	
	
}
