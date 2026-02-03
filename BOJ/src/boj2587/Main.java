package boj2587;

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
		int sum = 0;
		int[] arr = new int[5];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		sum /= arr.length;
		
		bw.write(Integer.toString(sum) + "\n");
		bw.append(Integer.toString(arr[2]));
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
