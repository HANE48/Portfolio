package Ex1_controlStatement;

/*
 * 1부터 12월까지 사용자가 원하는 월이 몇일 까지 있는지를 출력
 * 1,3,5,7,8,10,12월은 31일까지
 * 2월은 28일
 * 그 외는 30일 까지
 */

public class Ex5_else_if {

	public static void main(String[] args) {

		int month = 12;

		if(month == 1 || month == 3 || month == 5 ||
				month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + "월은 31일 까지 입니다");
		}else if(month == 4 || month == 6 ||
				month == 9 || month == 11) {
			System.out.println(month + "월은 30일 까지 입니다");
		}else if(month == 2) {
			System.out.println("2월은 28일 까지 입니다");
		}else {
			System.out.println("올바른 값을 입력해주세요");
		}
	}

}
