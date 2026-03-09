package boj10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * i/j 0 1 2 3 4 5 6 7 8 9 sum
 * 1   0 1 1 1 1 1 1 1 1 1  9
 * 2   1 2 2 2 2 2 2 2 2 2 17
 */

public class Main {

	static int n;
	static long[][] dp;
	static long count;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new long[n+1][10];	//dp[i][j]: 계단의 길이가 i이고 마지막 자리에 오는 숫자가 j인 계단 수의 개수
		dp[1][0] = 0;
		
		for(int i=1 ; i<=9 ; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2 ; i<=n ; i++) {
			for(int j=0 ; j<=9 ; j++) {
				if(j==0) {	//마지막 숫자가 0인 경우 앞에는 무조건 1만 올수있음
					dp[i][0] = dp[i-1][1] % 1000000000;
					continue;
				}
				if(j==9) {	//마지막 숫자가 9일경우 (?9)일떄 ?==8일수밖에 없다
					dp[i][9] = dp[i-1][8] % 1000000000;
					continue;
				}
				//그 이외의 경우
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
			}
		}
		
		for(int i=0 ; i<=9 ; i++) {
			count = (count+dp[n][i])%1000000000;
		}
		
		System.out.println(count);
		
	}//main

}
