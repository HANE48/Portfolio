package boj2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		int[] sum = new int[n+1];
		int max = Integer.MIN_VALUE;
		sum[0] = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1 ; i<=n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i] = sum[i-1] + arr[i];
			
		}
		
		for(int i=len ; i<=n ; i++) {
			max = Math.max(max, sum[i] - sum[i-len]);
		}
		
		System.out.println(max);
		
	}//main

}
