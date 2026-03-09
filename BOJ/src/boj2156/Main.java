package boj2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[Math.max(n+1, 4)];
		int[] wine = new int[Math.max(n+1, 4)];
		
		for(int i=1 ; i<=n ; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		if(n>=1) {
			dp[1] = wine[1];			
		}
		dp[2] = wine[1] + wine[2];
		dp[3] = Math.max(
				Math.max(wine[1] + wine[2], wine[1] + wine[3])
				, wine[2] + wine[3]);
		
		for(int i=4 ; i<=n ; i++) {
			dp[i] = Math.max(dp[i-1], 
					Math.max(dp[i-2] + wine[i], dp[i-3] + wine[i-1] + wine[i]));	 
		}
		
		System.out.println(dp[n]);
		
	}//main

}
