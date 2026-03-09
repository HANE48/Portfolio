package boj1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long[] arr = new long[1000001];
	
	static long fib(int n) {
		if(n==1) {
			return 1;
		}
		
		for(int i=3 ; i<=n ; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}
		
		return arr[n];
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr[1] = 1;
		if(n>=2) {
			arr[2] = 2;
		}

		//메서드를 안만들고 할 경우
//		for(int i=3 ; i<=n ; i++) {
//			arr[i] = arr[i-1] + arr[i-2];
//		}
		
		
		System.out.println(arr[n]);
	}//main

}
