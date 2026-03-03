package boj1037;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long max = 0;
		long min = 1000001;
		
		while(n-->0) {
			int m = Integer.parseInt(st.nextToken());
			if(m<min) {
				min = m;
			}
			
			if(max < m) {
				max = m;
			}
		}
		
		System.out.println(String.format("%d", min * max));
		
	}//main

}
