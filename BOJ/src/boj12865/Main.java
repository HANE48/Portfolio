package boj12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int[][] dp = new int[n+1][w+1];
		int[] weight = new int[n+1];
		int[] value = new int[n+1];
		
		for(int i=1 ; i<=n ; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=w ; j++) {
				if(j>=weight[i]) {	//무게가 현재 가방의 무게보다 가벼울 경우
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + value[i]);
				}else {	//너무 무거우면 이전의 값을 가져옴
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[n][w]);
		
		
	}//main

}
