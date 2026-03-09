package boj2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int score = Integer.MIN_VALUE;
	static int[] stair;
	static Integer[] dp;
	//top-down
	public static int find(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(find(n-2), find(n-3)+stair[n-1]) + stair[n];
		}
		return dp[n];
		
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		stair = new int[301];
		dp = new Integer[301];
		for(int i=1; i<=n ; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		//bottom-up
		dp[1] = stair[1];
		dp[2] = stair[1] + stair[2];
		dp[3] = Math.max(stair[1], stair[2]) + stair[3];
		
		for(int i=4 ; i<=n ; i++) {
			dp[i] = Math.max(dp[i-3] + stair[i-1] , dp[i-2]) + stair[i];
		}
		
		System.out.println(dp[n]);
		
		
	}//main

}
