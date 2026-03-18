package boj2110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		long[] arr = new long[n];
		
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long start = 0;
		long end = arr[n-1];
		long mid = (start+end) / 2;
		long res = Long.MIN_VALUE;
		
		while(start <= end) {
			mid = (start+end)/2;
			long count = 1;
			long last_position = arr[0];
			for(int i=1 ; i<arr.length ; i++) {
				if(arr[i]-last_position >= mid) {
					count++;
					last_position = arr[i];
				}
			}
			
			if(count >= m) {
				res = Math.max(mid, res);
				start = mid+1;
			}else {
				end = mid-1;
			}
			
		}//while
		
		System.out.println(res);
		
	}//main

}
