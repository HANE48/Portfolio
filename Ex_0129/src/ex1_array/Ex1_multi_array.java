package ex1_array;


/*
 * 1차원 배열이 2개 모이면 2차원 배열
 * 2차원 배열이 3개 모이면 3차원 배열
 * 
 */


public class Ex1_multi_array {

	public static void main(String[] args) {
		//new int[1차원 배열의 갯수][각 1차원 배열의 index 수]
		int[][] arr = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		//arr[1][3] = 700;	//존재하지 않는 인덱스에 접근할 수 없다.
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {		//2차원 배열에서 열의 갯수를 알려면 배열[]의 행의 정보를 주면 그 행에 길이를 반환함
				System.out.print(arr[i][j] + " ");
			}//inner
			System.out.println();
		}//outer
		
		
		
		
	}//main

}
