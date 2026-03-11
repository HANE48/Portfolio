package boj11401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static final long M = 1_000_000_007;

	static long pow(long base, long exp) {
		if(exp == 1) {
			return base % M;
		}
		
		long temp = pow(base, exp/2);
		
		if(exp % 2 == 0) {
			return (temp*temp) % M;
		}else {
			return (temp*temp % M) * base % M;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		long facn = 1;
		long fack = 1;
		long facnk = 1;
		
		for(int i=n ; i>0 ; i--) {
			facn = (facn * i) % M;
		}
		
		for(int i=k ; i>0 ; i--) {
			fack = (fack * i) % M;
		}
		
		for(int i=n-k ; i>0 ; i--) {
			facnk = (facnk*i) % M;
		}
		
		long a = (fack * facnk) % M;
		a = pow(a, M-2);
		System.out.println((facn*a)% M);
		
	}//main

}
