package ex1_contorlStatement;

import java.util.Scanner;

/*
 	n1과 n2를 입력받고 n1~n2사이의 합을 출력
 	-----------
 	입력: 2 5
 	출력: 14
 	-----------
 	입력: 5 2
 	출력: 14
 */

public class Ex5_single_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, sum=0, temp;
		System.out.println("숫자 두개를 입력해주세요");
		System.out.println("숫자 1:");
		n1 = sc.nextInt();
		System.out.println("숫자 2:");
		n2 = sc.nextInt();
		sc.close();
		
		if(n2<n1) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}//if
		
		for( ; n1<=n2 ; n1++) {
			sum += n1;
		}//for
		
		System.out.println(sum);
		
	}//main

}
