package boj2565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] arr = new int[n][2];
		int[] dp = new int[n];
		int count = Integer.MIN_VALUE;
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
		
		for(int i=0 ; i<n ; i++) {
			dp[i] = 1;
			for(int j=0 ; j<i ; j++) {
				if(arr[j][1] < arr[i][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			count = Math.max(count, dp[i]);
		}
		
		System.out.println(n-count);

	}//main

}
