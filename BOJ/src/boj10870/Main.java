package boj10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		
	public static long fib(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(fib(Integer.parseInt(br.readLine())));
		
	}

}
