package boj11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] upDp = new int[n+1];
		int[] downDp = new int[n+1];
		int[] arr = new int[n+1];
		int count = Integer.MIN_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1 ; i<=n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			upDp[i] = 1;
			downDp[i] = 1;
		}
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<i ; j++) {
				if(arr[j] < arr[i]) {
					upDp[i] = Math.max(upDp[i], upDp[j] + 1);
				}
			}
		}
		
		for(int i=n ; i>=1 ; i--) {
			for(int j=n ; j>i ; j--) {
				if(arr[j] < arr[i]) {
					downDp[i] = Math.max(downDp[i], downDp[j] + 1);
				}
			}
		}
		
		for(int i=1 ; i<=n ; i++) {
			count = Math.max(count, upDp[i] + downDp[i] -1);
		}
		
		System.out.println(count);
		
	}//main

}
