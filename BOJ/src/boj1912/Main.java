package boj1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static long max;
	static int[] dp;
	static long sum;
	
	public static void kadane() {
		
		for(int i=2 ; i<=n ; i++) {
			sum = Math.max(dp[i], sum+dp[i]);
			max = Math.max(max,  sum);
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		dp = new int[n+1];
		
		for(int i=1 ; i<=n ; i++) {
			dp[i] = Integer.parseInt(st.nextToken());
		}
		sum = dp[1];
		max = dp[1];
		
		kadane();
		
		System.out.println(max);
	}//main

}
