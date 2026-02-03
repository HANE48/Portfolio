package boj2798;

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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int sum = 0;
		int ans = 0;
		int i = 0;
		int j = 1;
		int k = 2;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		i=0;
		while(true) {
			sum = 0;
			if(k>=arr.length-1) {
				j++;
				k=j+1;
				if(k>=arr.length-1) {
					i++;
					j=i+1;
					k=j+1;
				}
				if(arr.length-2==i) {
					break;
				}
			}//if
			
			sum = arr[i] + arr[j] + arr[k];
			
			if(sum<=m && ans<sum) {
				if(sum == m) {
					ans = sum;
					break;
				}else{
					ans = sum;
				}
				
			}
			k++;
		}//while
		
		bw.write(Integer.toString(ans));
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
