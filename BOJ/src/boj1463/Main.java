package boj1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int res = Integer.MAX_VALUE;
	
	public static void toOne(int n, int cnt) {
		
		if(n==1) {
			res = Math.min(res, cnt);
			return ;
		}
		if(cnt >= res) {
			return;
		}
		
		if(n % 3 == 0) {
			toOne(n/3, cnt+1);
		}
		
		if(n % 2 == 0) {
			toOne(n/2, cnt+1);
		}
		toOne(n-1, cnt+1);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		toOne(n, 0);
		System.out.println(res);
		
		
	}//main

}
