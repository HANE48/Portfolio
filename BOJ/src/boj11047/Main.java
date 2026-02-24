package boj11047;

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
		int[] arr;
		
		int n = Integer.parseInt(st.nextToken());
		int res = Integer.parseInt(st.nextToken());
		int index=n-1;
		int coin = 0;
		
		arr = new int[n];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]>res) {
				index = i;
				
			}
		}
		
		for(int i=index ; i>=0 ; i--) {
			if(res <= 0) {
				break;
			}	
			
			if(arr[i] <= res) {
				coin += res/arr[i];
				res %= arr[i];				
			}
			
		}
		
		bw.write(Integer.toString(coin));
		bw.flush();
		bw.close();
		br.close();
		
	}//main
	

}
