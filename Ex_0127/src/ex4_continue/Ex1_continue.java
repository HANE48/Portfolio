package ex4_continue;


/*
 * continue문: 반복문 내에서 특정 문장을 건너뛰고자 할 때
 * 
 */

public class Ex1_continue {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<=5 ; ) {
				j++;
				if(j%2 == 0) {
					continue;			//for문 내부의 continue는 가장 가까운 증감식으로 건너뛴다
										//단 증감식이 없으면 조건식으로 건너뛴다.
				}
				System.out.print(j + " ");
			}//inner
		}//outer
		
	}//main

}
