package boj9086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n;
		String[] arr;
		
		n = Integer.parseInt(br.readLine());
		arr = new String[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0 ; i<n ; i++) {
			char f = arr[i].charAt(0);
			char l = arr[i].charAt(arr[i].length()-1);
			bw.write(Character.toString(f) + Character.toString(l) + "\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main

}
