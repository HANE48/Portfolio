package Ex2_controlStatement;

import java.util.Scanner;

/*
 	키보드로 월을 입력받아 
 	3-5월은 봄
 	6-8월은 여름
 	9-11월은 가을
 	12-2월은 겨울
 */

public class Ex5_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		
//		if(month>=3 && month <=5) {
//			System.out.println("봄");
//		}else if(month>=6 && month <=8) {
//			System.out.println("여름");
//		}else if(month >= 9 && month <= 11) {
//			System.out.println("가을");
//		}else if(month == 12 || (month <= 2 && month >0)) {
//			System.out.println("겨울");
//		}else {
//			System.out.println("올바른 값을 입력해주세요.");
//		}
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("가을");
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
		default:
			System.out.println("올바른 값을 입력해주세요.");
			break;
		}//switch
		
		
	}//main

}
