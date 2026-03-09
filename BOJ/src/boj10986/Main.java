package boj10986;

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
		long[] sum = new long[n+1];
		long[] countRem = new long[m];
		long count = 0;
		st = new StringTokenizer(br.readLine(), " ");
		
		countRem[0] = 0;
		for(int i=1 ; i<=n ; i++) {
			int input = Integer.parseInt(st.nextToken());
			sum[i] = (sum[i-1] + input) % m;
			if(sum[i] == 0) {
				count++;
			}
			countRem[(int)sum[i]]++;
			
		}
		
		for(int i=0 ; i<m ; i++) {
			if(countRem[i] > 1) {
				count = count + (countRem[i] * (countRem[i] - 1)/2);
			}
		}
		
		System.out.println(count);
	
	}//main

}
