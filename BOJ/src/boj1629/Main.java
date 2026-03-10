package boj1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static long power(long base, long exponent, long c) {
		if(exponent == 1) {
			return base % c;
		}
		
		long temp = power(base, exponent/2, c);
		if(exponent % 2 == 0) {
			return (temp * temp) % c;
		}else {
			return (temp * temp % c) * base % c;
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		System.out.println(power(a, b, c));
		
	}//main

}
