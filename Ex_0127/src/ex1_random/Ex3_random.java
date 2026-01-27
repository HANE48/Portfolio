package ex1_random;

import java.util.Random;

/*
 * 랜덤을 활용하여 알파벳 대문자 A에서 Z사이의 값중 하나를 무작위로 출력
 */

public class Ex3_random {

	public static void main(String[] args) {
		System.out.println(Character.toChars(new Random().nextInt('Z' - 'A' + 1) + 'A'));
	}//main
}
