package ex3_break;

import java.util.Scanner;

public class Ex3_break {

	public static void main(String[] args) {
		
		for( int i=1 ; i<=2 ; i++ ) {
			
			System.out.println("i: " + i);
			
			switch(i) {
			case 1:
				System.out.println("Case 1");
				break;		//switch안에서만 수행
			case 2:
				System.out.println("Case 2");
				break;
				
			}//switch
			
		}//for
		
		System.out.println("------------------------");
		
		/*
		 * 1부터 사용자가 입력받은 숫자까지 합을 구하되
		 * 합이 20이 넘어가면 반복을 종료
		 * -----------------------------
		 * 값: 5
		 * 총합: 15
		 * 
		 * 값: 10
		 * 총합: 21
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1 ; i<=n ; i++) {
			if(i==n) {
				sum += i;
				System.out.println(sum);
			}
			if(sum>=20) {
				System.out.println(sum);
				break;
			}
			sum += i;
		}
		
		sc.close();
		
		
		
	}//main

}
