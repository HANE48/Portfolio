package boj1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	static void divide(int row, int col, int size) {
		
		boolean flag = true;						//전부 같으면 true 아니면 flase
		
		int now = arr[row][col];
		out: for(int i=row ; i<row+size ; i++) {
			for(int j=col ; j<col+size ; j++) {
				if(arr[i][j] != now) {
					flag = false;
					break out;
				}
			}
		}//for
		
		if(flag) {
			sb.append(now);
		}else {
			sb.append("(");
			divide(row, col, size/2);					//왼쪽 위
			divide(row, col+ size/2, size/2);			//오른쪽 위
			divide(row+size/2, col, size/2);			//왼쪽 아래
			divide(row+size/2, col+size/2, size/2);		//오른쪽 아래	
			sb.append(")");
		}	
		
		
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for(int i=0 ; i<n ; i++) {
			String str = br.readLine();
			for(int j=0 ; j<n ; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
			
		}//for
		divide(0,0, n);
		System.out.println(sb);
		
	}//main

}
