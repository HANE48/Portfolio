package boj1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int cost = 0;
	static int[][] dp;
	
	public static void color() {	//index에 이전 집에 어떤 색을 칠했는지를 전달
		int red = 0;
		int blue = 0;
		int green = 0;
		
		for(int i=1 ; i<n ; i++) {
			dp[i][0] = dp[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = dp[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = dp[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
		}
		
		cost = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		dp = new int[n][3];
		
		for(int i=0 ; i<dp.length ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<dp[i].length ; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
			}//inner
		}//outer
		
		color();
		System.out.println(cost);
		
	}//main
	
}
