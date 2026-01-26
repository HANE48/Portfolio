package Ex2_controlStatement;

public class Ex3_switch {

	public static void main(String[] args) {
		/*
		 * 김, 이, 박, 최, 정씨의 분포도 출력 김 - 21% 이 - 14% 박 - 8% 최 - 4% 정 - 3% etc - 데이터가 없습니다
		 * switch문의 비교값 타입으로 사용할 수 있는 자료형
		 * 1) 정수(byte, short, int)
		 * 2) 문자(char)
		 * 3) 문자열(String)
		 */

		String name = "가";
		String per = "";
		switch (name) {	
		case "김":
			per = "21%";
			break;

		case "이":
			per = "14%";
			break;

		case "박":
			per = "8%";
			break;

		case "최":
			per = "4%";
			break;

		case "정":
			per = "3%";
			break;

		default:
			per = "데이터가 없습니다.";
			break;

		}// switch
		System.out.println(per);

	}// main

}
