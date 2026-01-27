package boj11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n, arr[], sum=0 ; 
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		String temp = br.readLine();
		
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = temp.charAt(i)-'0';
			sum += arr[i];
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
