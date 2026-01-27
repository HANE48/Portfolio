package ex1_random;

import java.util.Random;

/*
 * 난수 발생
 * 1~5 사이의 난수
 * 
 * 1~5 사이의 난수
 * 각 숫자에 해당하는 윷놀이 패를 출력
 */

public class Ex1_random {

	public static void main(String[] args) {
		int num = new Random().nextInt(5) + 1;
		System.out.println(num);
		
		//107 ~ 256
		//new Random().nextInt(난수범위) + 시작수
		//new Random().nextInt(큰수 - 작은 수 +1)
		int num2 = new Random().nextInt(256 - 107 + 1) + 107; 
		System.out.println(num2);
		System.out.println("=====================");
		
		//1~5 사이의 난수
		//각 숫자에 해당하는 윷놀이 패를 출력
		
		int n = new Random().nextInt(5) + 1;
		String s="";
		switch(n) {
		case 1:
			s="도";
			break;
		case 2:
			s="개";
			break;
		case 3:
			s="걸";
			break;
		case 4:
			s="윷";
			break;
		case 5:
			s="모";
			break;
		}
		System.out.println(s);
		
	}//main

}
