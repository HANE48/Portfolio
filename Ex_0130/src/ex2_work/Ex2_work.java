package ex2_work;

import java.util.Scanner;

/* 
 * 아래 2차원 배열에서 키보드에서 입력받은 값보다 큰 첫번째 값을 찾아 출력하고,
 * 찾아낸 값이 포함된 행을 모두 출력
 * ---------------------------------------------------
 * 찾을 값: 10
 * 10보다 큰 첫번째 요소: 11
 * 해당 행의 모든 요소
 * 9 10 11 12
 * 
 */

public class Ex2_work {

	public static void main(String[] args) {
		
		int[][] arr = { {1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15, 16} };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값: ");
		int n = sc.nextInt();
		int row = 0;

		out: for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				if(arr[i][j]>n) {
					System.out.println(n + " 보다 큰 첫 번째 요소: " + arr[i][j]);
					row = i;
					break out;
				}
			}//inner
		}//outer
		
		System.out.println("해당 행의 모든 요소");
		for(int i=0 ; i<arr[row].length ; i++) {
			System.out.print(arr[row][i] + " ");
		}
		
		sc.close();
		
	}//main

}
