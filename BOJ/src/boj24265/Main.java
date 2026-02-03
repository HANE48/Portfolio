package boj24265;

/*
 * 첫째 줄에 코드1 의 수행 횟수를 출력한다.
 * 둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 
 * 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println(((n*n)-n)/2);
		System.out.println("2");
		sc.close();
		
	}//main

}
