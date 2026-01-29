package ex4_work;

import java.util.Scanner;

/* 배열의 크기를 입력받고 배열을 생성 후 배열안에 정수를 입력받아 배열에 넣는다
 * 그 이후 홀수와 짝수의 갯수를 구한다
 * 배열의 크기: 5
 * 정수: 5
 * 정수: 3
 * 정수: 2
 * 정수: 11
 * 정수: 20
 * -----------
 * 홀수: 3
 * 짝수: 2
 */

public class Ex6_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int odd = 0, even = 0, i=0;
		
		while(n --> 0) {
			System.out.print("정수: ");
			int a = sc.nextInt();
			arr[i] = a;
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
			i++;
		}
		
		System.out.println("-----------\n홀수: " + odd + "\n짝수: " + even);
		sc.close();
		
	}//main

}
