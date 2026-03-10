package boj2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int white = 0;
	static int blue = 0;
	
	static void divide(int row, int col, int size) {
		if(size == 1) {
			if(arr[row][col] == 1) {
				blue++;
			}else {
				white++;
			}
			return ;
		}
		
		int now = arr[row][col];
		boolean same = true;
		out : for(int i=row ; i<row+size ; i++) {
			for(int j=col ; j<col+size ; j++) {
				if(now != arr[i][j]) {
					same = false;
					break out;
				}
			}
		}
		
		if(same) {
			if(now == 0) {
				white++;
			}else {
				blue++;
			}
		}else {
			
			divide(row, col, size/2);				//왼쪽 위
			divide(row, col+size/2, size/2);		//오른쪽 위
			divide(row+size/2, col, size/2);		//왼쪽 아래
			divide(row+size/2, col+size/2, size/2);	//오른쪽 아래
		}
		
	}//divide

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		StringTokenizer st;
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<n ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		
		divide(0,0,n);
		System.out.println(white);
		System.out.println(blue);
		
		
		
	}//main
	
}
