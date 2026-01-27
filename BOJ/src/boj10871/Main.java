package boj10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st, ar;
		
		int n, x;
		int[] arr;
		st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		ar = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(ar.nextToken());
			if(arr[i]<x) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		br.close();
		
		
		
	}

}
