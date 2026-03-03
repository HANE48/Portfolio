package boj1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int[][] arr = new int[30][30];
	
	public static int combination(int n, int k) {
		
		if(arr[n][k] > 0) {
			return arr[n][k];
		}
		
		if(n==k || k == 0) {
			return arr[n][k] = 1;
		}
		
		return arr[n][k] = combination(n-1, k-1) + combination(n-1, k);
	}//combination

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
//		for(int i=0 ; i<30 ; i++) {
//			arr[i][i] = 1;
//			arr[i][0] = 0;
//		}
//		
//		for(int i=2 ; i<30 ; i++) {
//			for(int j=1 ; j<30 ; j++) {
//				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
//			}
//		}
		
		
		int re = Integer.parseInt(br.readLine());
		
		while(re-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			sb.append(combination(k,n)).append("\n");
//			sb.append(arr[k][n]).append("\n");
			
		}
		
		System.out.println(sb);
		br.close();
	}//main

}
