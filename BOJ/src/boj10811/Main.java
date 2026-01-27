package boj10811;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer ar, st = new StringTokenizer(br.readLine() , " ");
		
		int n, m, arr[], temp = 0;
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0 ; i<m ; i++) {
			int j, k;
			
			ar = new StringTokenizer(br.readLine(), " ");
			j = Integer.parseInt(ar.nextToken())-1;
			k = Integer.parseInt(ar.nextToken())-1;
			
			while(j<k) {
				temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				j++;
				k--;
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			bw.write(Integer.toString(arr[i]) + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}//main

}
