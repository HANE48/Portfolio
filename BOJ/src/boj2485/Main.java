package boj2485;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int gcd = 0;
		
		for(int i=0 ; i<arr.length - 1 ; i++) {
			int dis = arr[i+1] - arr[i];
			gcd = findGCD(dis, gcd);
		}
		
		bw.write(Integer.toString((arr[n-1]-arr[0])/gcd+1-(arr.length)));
		bw.flush();
		br.close();
		bw.close();
		
	}//main

	
	static int findGCD(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
		
	}
	
}
