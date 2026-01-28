package ex1_work;

import java.util.Scanner;

/*
 * 1부터 입력받은 숫자까지 순차적으로 출력하되
 * 5의 배수이거나 1의 자리가 3인 경우는 출력에서 제외
 */

public class Ex4_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			if(i%5==0 || i%10 == 3 || i==3) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}//main

}
