package ex1_work;

import java.util.Scanner;

/*
 * 키보드에서 월을 입력받아
 * 3~5월은 봄
 * 6~8월은 여름
 * 9~11월은 가을
 * 12~2월은 겨울을 출력하시오
 */


public class Ex2_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		switch(n) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		}
		
		sc.close();
		
	}//main

}
