package ex1_contorlStatement;

import java.util.Scanner;

public class Ex1_singleFor {

	public static void main(String[] args) {
		/*
		 	for문: 특정 명령을 원하는 만큼 반복하기 위해 사용
		 	for( 초기식 ; 조건식 ; 증감식){
		 		조건식이 참일 때 실행되는 영역
		 	}
		 */
		for(int i=0 ; i<=2 ; i++) {
			System.out.println(i);
		}
		for(int i=5 ; i<=6 ; i++) {
			System.out.println("결과: " + i);
		}
		
		System.out.println("-----------------------------");
		//10부터 1까지 출력
		for(int i=10 ; i>0 ; i--) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------");
		//1부터 100까지 반복하며 5의 배수만 출력
		for(int i=5 ; i<=100 ; i+=5 ) {
			System.out.println(i);
			
		}//for
		
		System.out.println("-----------------------------");
		for(int i=0 ; i<=95 ; ) {
			i+=5;
			System.out.println(i);
		}//for
		
		System.out.println("-----------------------------");
		for(int i=0 ; i<= 100 ; i+=5){
			System.out.println(i);
		}//for
		
		System.out.println("-----------------------------");
		//1부터 입력받은 숫자 까지의 반복중에 홀수의 합을 계산하여 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		
		for(int i=0 ; i<n ; i++) {
			if( i%2 != 0) {
				sum+=i;
			}//if
		}//for
		System.out.println(sum);
		sc.close();
		sum=0;
		System.out.println("-----------------------------");
		for(int i=1 ; i<=n ; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
		
	}//main

}
