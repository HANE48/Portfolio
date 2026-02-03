package ex7_work;

import java.util.Scanner;

/*
 * 구매 금액과 회원 등급에 따라 적립 포인트 계산하기
 * --등급 기준--
 * vip -> 구매 금액의 10%
 * GOLD -> 5%
 * Silver -> 3%
 * 잘못된 등급 입력시 '등급이 옳바르지 않습니다' 출력하고 0 반환
 * 조건 1) 키보드를 통해 구매 금액과 회원등급을 받는것은 메인에서
 * 조건 2) 적립 포인트도 Main에서 출력
 * 조건 3) MService에서는 구매 금액과 회원 등급에 따른 적립 포인트만 계산하여 반환
 * ------------------------
 * 구매 금액: 10000 
 * 회원 등급: VIP
 * 적립 포인트: 1000
 * 
 */

public class MMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MService m = new MService();
		
		System.out.print("구매 금액: ");
		double money = sc.nextDouble();
		
		System.out.print("회원 등급: ");
		String str = sc.next();
		
		double point = m.point(money, str);
		if(point == 0.0) {
			System.exit(0);
		}
		System.out.println("적립 포인트: " + point);
		sc.close();
		
	}//main

}
