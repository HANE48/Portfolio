package boj11399;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		int sum = 0;
		int prev = 0;
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}//for
		
		Arrays.sort(arr);
		
		for(int i=0 ; i<arr.length ; i++) {
			sum += prev + arr[i];
			prev += arr[i];
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
