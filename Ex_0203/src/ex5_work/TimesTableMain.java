package ex5_work;

import java.util.Scanner;

/*
 * 키보드에서 정수 값을 하나 입력받아
 * 입력받은 값에 해당하는 구구단 출력
 * 조건1) 키보드에서 단을 입력받는 코드는 TimesTableMain에 작성
 * 조건2) 구구단 결과는 TimesTable 클래스의 메서드에서 처리
 * ----------------------
 * 단: 5
 * 5 * 1 = 5
 * ...
 * 5 * 9 = 45
 */

public class TimesTableMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimesTable tt = new TimesTable();
		
		System.out.print("단: ");
		
		tt.gugudan(sc.nextInt());
		
		sc.close();
	}//main

}
