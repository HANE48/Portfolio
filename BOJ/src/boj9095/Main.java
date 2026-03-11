package boj9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[12];
		StringBuilder sb = new StringBuilder();
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4 ; i<=11 ; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		while(n-->0) {
			int k = Integer.parseInt(br.readLine());
			sb.append(dp[k]).append("\n");
		}
		
		System.out.println(sb);
		
		
	}//main

}
