package ex9_game;

import java.util.Scanner;

/*	
 * 클래스 나눠서 만들기
 * 업-다운 게임
 * 1~50사이의 난수를 발생시키고
 * 그 난수가 무엇인지 맞추는 게임
 * 조건: 	정답을 입력받는 코드
 * 		게임이 끝났을때 종료하는 코드는 메인에서
 * -------------------
 * >> 30
 * Down!!
 * >> 27
 * DOWN!!
 * >> 20
 * UP!!
 * >> 25
 * 4회만에 정답!
 * -------------------
 * 
 */


public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		int cnt = 1;
		
		while(true) {
			System.out.print(">>");
			String s = g.checkNum(sc.nextInt());
			
			if(s.equals("ANSWER!")) {
				System.out.println(cnt + "회만에 정답!");
				break;
			}
			System.out.println(s);
			cnt++;
		}//while
		sc.close();
	}//main

}
