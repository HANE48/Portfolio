package BOJ5597;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[32], min= 2147483647, max=-2147483647;
		
		for(int i=1 ; i<31 ; i++) {
			arr[i] = 0;
		}
		
		
		for(int i=0 ; i<28 ; i++) {
			int j = Integer.parseInt(br.readLine());
			if(arr[j]==0) {
				arr[j]++;
			}
		}
		
		for(int i=1 ; i<31 ; i++) {
			if(arr[i]==0) {
				if(min > arr[i]) {
					min = i;
				}
				if(max < arr[i]) {
					max = i;				
				}
			}
		}
		
		bw.write(Integer.toString(max) + "\n" + Integer.toString(min));
		bw.flush();
		bw.close();
		br.close();
	}//main

}
