package ex2_work;

import java.util.Scanner;

/*
 * 키보드에서 입력받은 값을 초과하는 첫번째 요소를 찾아 출력
 * ---------------
 * 값: 5
 * 결과: 8
 */


public class Ex2_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = { {1,2,3}, {0, 2, 5 ,8}, {7, 9}};
		
		System.out.print("값: ");
		int n = sc.nextInt();
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				if(arr[i][j] > n) {
					System.out.print("결과: " + arr[i][j]);
					System.exit(0);
				}
			}
		}
		
		sc.close();
		
	}//main

}
