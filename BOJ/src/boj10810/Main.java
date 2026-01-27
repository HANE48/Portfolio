package boj10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int m, n, arr[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "), ar;
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		for(int i=0 ; i<m ; i++) {
			arr[i] = 0;
		}
		
		for(int i=0 ; i<n ; i++) {
			ar = new StringTokenizer(br.readLine(), " ");
			int j = Integer.parseInt(ar.nextToken());
			int k = Integer.parseInt(ar.nextToken());
			int l = Integer.parseInt(ar.nextToken());
			for(j-=1;j<=k-1;j++) {
				arr[j] = l;
			}
		}
		
		for(int i=0 ; i<m ; i++) {
			System.out.print(arr[i] + " ");
		}
	}//main

}
