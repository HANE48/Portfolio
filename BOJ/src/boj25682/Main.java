package boj25682;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][m+1];
		
		for(int i=1 ; i<=n ; i++) {
			String str = br.readLine();
			for(int j=1 ; j<=m ; j++) {
				if(((i+j)%2 == 0 && str.charAt(j-1)=='W') || ((i+j)%2 != 0 && str.charAt(j-1)=='B')) {
					arr[i][j] = arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
				}else {
					arr[i][j] = 1 + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
				}
			}
		}//outer
		
		int res = Integer.MAX_VALUE;
		for(int i=k ; i<=n ; i++) {
			for(int j=k ; j<=m ; j++) {
				int a = arr[i][j] - arr[i-k][j] - arr[i][j-k] + arr[i-k][j-k];
				int b = (k*k)- a;
				res = Math.min(Math.min(a, b), res);
				
			}
		}
		
		System.out.println(res);
		
	}//main

}
