package ex2_work;

import java.util.Random;
/*
 * 1 ~ 45 사이의 중복되지 않는 난수 6개를 생성하는,
 * 로또번호 출력 프로그램 만들기
 * 배열을 써서 중복체크하기
 */

public class Ex4_work {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();
		
		outer : for(int i=0 ; i<lotto.length ; ) {
			
			lotto[i] = r.nextInt(6) + 1;
			
			for(int j=0 ; j<i ; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.println(lotto[i] + " ");
			i++;
		}//for
		
		
		
		
		for(int i=0 ; i<lotto.length ; i++) {
			lotto[i] = r.nextInt(45)+1;
		}
		
		for(int i=0 ; i<lotto.length ; i++) {
			for(int j=1 ; j<lotto.length ; j++) {
				if(i != j && lotto[i] == lotto[j]) {
					while(true) {
						lotto[j] = r.nextInt(45)+1;
						if(lotto[i] != lotto[j]) {
							i=0;
							j=1;
							break;
						}
					}//while
				}
			}//inner
		}//outer
		
		
		for(int i : lotto) {
			System.out.print(i + " ");
		}
		
	}//main

}
