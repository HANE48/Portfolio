package boj1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		while(m-->0) {
			if(binarySearch(0, n-1, Integer.parseInt(st.nextToken()))) {
				sb.append("1").append("\n");
			}else {
				sb.append("0").append("\n");
			}
			
			
		}//while
		System.out.println(sb);
		
	}//main
	
	static boolean binarySearch(int sta, int end, int sea) {
		if(sta > end) {
			return false;
		}
		
		int mid = (sta+end) / 2;
		
		if(arr[mid] == sea) {
			return true;
		}
		
		if(arr[mid] > sea) {	//중앙값이 탐색하는 값보다 클 경우
			if(binarySearch(sta, mid-1, sea)) {
				return true;
			}else {
				return false;
			}
		}else {					//중앙값이 탐색하는 값보다 작을경우
			if(binarySearch(mid+1, end, sea)) {
				return true;
			}else {
				return false;
			}
		}
	}//binarySearch
	

}
