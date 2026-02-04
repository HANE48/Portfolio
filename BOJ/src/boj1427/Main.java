package boj1427;

/*
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 
 * 그 수의 각 자리수를 내림차순으로 정렬해보자.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		long[] arr = new long[str.length()];
		
		for(int i=0 ; i<str.length() ; i++) {
			arr[i] = str.charAt(i)-'0';
		}
		
		Arrays.sort(arr);
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			bw.write(Long.toString(arr[i]));
		}
		
		bw.flush();
		br.close();
		bw.close();
	
	}//main

}
