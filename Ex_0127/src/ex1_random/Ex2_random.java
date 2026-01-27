package ex1_random;

import java.util.Random;

/*
 * 2~9 사이의 난수를 발생시켜 발생한 난수에 해당하는 구구단 출력
 */


public class Ex2_random {

	public static void main(String[] args) {
		int n1 = new Random().nextInt(8) + 2;
		
		for(int i=1 ; i<10 ; i++) {
			System.out.printf("%d * %d = %d\n",n1,i,n1*i);
		}
	}//main

}
