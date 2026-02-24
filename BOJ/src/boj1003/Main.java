package boj1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	static Integer[][] arr = new Integer[41][2];	//0, 1을 저장

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
		
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		
		while(n-->0) {
			int num = Integer.parseInt(br.readLine());
			fib(num);
			sb.append(arr[num][0] + " " + arr[num][1]).append("\n");
			
		}//while
		
		System.out.println(sb);
		
		br.close();
		
	}//main

	public static Integer[] fib(int n) {
		
		if(arr[n][0] == null || arr[n][1] == null) {
			arr[n][0] = fib(n-1)[0] + fib(n-2)[0];
			arr[n][1] = fib(n-1)[1] + fib(n-2)[1];
		}
		return arr[n];
		
	}
}
