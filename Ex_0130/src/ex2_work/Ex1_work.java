package ex2_work;

/*
 * 2차원배열 arr에서 3의 배수를 제외한 나머지 값들만 출력
 * ------------------------------------
 * 8 11
 * 7 1
 * 10
 */

public class Ex1_work {

	public static void main(String[] args) {
		
		int[][] arr = { {8, 11, 21},
						{9, 7, 1},
						{6, 12, 10} };
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				if((arr[i][j] % 3) == 0) {
					continue;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}//main

}
