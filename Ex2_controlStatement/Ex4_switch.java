package Ex2_controlStatement;

import java.util.Scanner;

/*
 * 1부터 12월까지 사용자가 원하는 월이 몇일 까지 있는지를 출력
 * 1,3,5,7,8,10,12월은 31일까지
 * 2월은 28일
 * 그 외는 30일 까지
 */

public class Ex4_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇월? : ");
		int month = sc.nextInt();
		sc.close();
		
		switch(month) {
		case 1:
		case 3:
		case 5:	
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일 까지 있습니다", month);
			break;
		case 2:
			System.out.println(month + "월은 28일 까지 있습니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일 까지 있습니다");
			break;
		default:
			System.out.println("올바른 값을 입력해주세요!!!");
			break;
		}//switch
		
	}// main

}
