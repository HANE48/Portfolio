package ex2_controlStatement;

import java.util.Random;

/*
 * java, jsp, android의 시험을 봤다
 * 각 과목별 점수는 랜덤으로 0 ~ 130사이의 값을 대입
 * 과목별 점수가 0~100사이가 아니라면 0에서 100사이의 값이 나올 때 까지 do-while을 반복
 * 모든 과목 점수가 0 ~ 100 범위 일때 반복문을 종료하고 결과를 출력
 * --------------------------------------------------------------
 * 자바: 100
 * jsp: 100
 * 안드로이드: 100
 */

public class Ex3_do_while {

	public static void main(String[] args) {
		int java, jsp, android;
		
		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			android = new Random().nextInt(131);
		}while(java>100 || jsp > 100 || android > 100);
		
		System.out.printf("자바: %d\njsp: %d\nandroid: %d", java, jsp, android);
	}//main

}
