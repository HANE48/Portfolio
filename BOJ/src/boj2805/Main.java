package boj2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static long res = Long.MIN_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		arr = new int[n];
		
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		binarySearch(0, arr[n-1], m);
		System.out.println(res);
		
	}//main
	
	static void binarySearch(long start, long end, int num) {
		while(start <= end) {
			long mid = (start+end) / 2;
			long sum = 0;
			for(int i=0 ; i< arr.length ; i++) {
				if(!(arr[i]-mid <= 0)) {
					sum += arr[i]-mid;
				}
			}
			
			if(sum >= num) {
				res = Math.max(res, mid);
				start = mid+1;
			}else {
				end = mid-1;
			}
			
		}
		
	}//binarySearch
}
