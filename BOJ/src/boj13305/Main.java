package boj13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] load = new int[n-1];
		int[] oil = new int[n];
		long res = 0;
		long min = Long.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<load.length ; i++) {
			load[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<oil.length ; i++) {
			oil[i] = Integer.parseInt(st.nextToken());
		}
		
		min = oil[0];
		res = min * load[0];
		
		for(int i=1 ; i<load.length ; i++) {
			if(min > oil[i]) {
				min = oil[i];
			}
			res += min * load[i];
		}
		
		System.out.println(res);
		
	}//main

}
