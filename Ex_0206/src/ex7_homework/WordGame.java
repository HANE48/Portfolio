package ex7_homework;

import java.util.Random;
import java.util.Scanner;

/*
 * 주어진 배열에서 랜덤으로 골라 단어를 섞는다
 * 그 섞인 단어를 맞추는 게임
 * ----------------------------
 * 문제: PEALP
 * >> ealpp
 * ealpp 오답...
 * >> apple 정답:
 */

public class WordGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = { "DOCTOR", "HOPE", "VIEW", "APPLE" };
		StringBuilder sb;
		StringBuilder rb;
		Word w = new Word();
		
		int index = new Random().nextInt(strArr.length);
		sb = new StringBuilder(strArr[index]);
		rb = w.reMake(sb);
		w.startGame(rb, sc);
		
		sc.close();
		
	}//main

}
