package boj11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int cs = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		int[] sum = new int[n+1];
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		
		sum[0] = 0;
		for(int i=1 ; i<=n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i] = arr[i] + sum[i-1];
		}
		
		while(cs-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			sb.append(sum[end]-sum[start-1]).append("\n");
			
		}
		
		System.out.println(sb);
		
	}//main
	
}
