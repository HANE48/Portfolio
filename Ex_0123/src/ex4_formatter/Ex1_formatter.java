package ex4_formatter;

/*
  	formatter의 자료형 타입
  	%d: 정수(byte, short, long, int) 등
  	%c: 문자(char)
  	%s: 문자열(String)
  	%f: 실수형(float, double)
  	%b: 논리(true, false)
  	%%: %문자
 */


public class Ex1_formatter {

	public static void main(String[] args) {
		int age = 30;
		char name = '김';
		System.out.printf("저의 나이는 %d살 입니다\n", age);
		System.out.printf("-----------------------\n");
		System.out.printf("나는 %c씨 입니다\n", name);
		System.out.printf("%b or %b\n", true, false);
		System.out.printf("오늘의 기온은 %.1f\n", 0.001);
		System.out.printf("%03d %02d %03d\n", 8, 9, 10);
		System.out.printf("%s씨 앞으로\n", "가나다");
		System.out.printf("김씨는 %d%%입니다", 22);
		
	}//main

}
