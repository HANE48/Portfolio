package boj2738;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//N*M크기의 두 행렬 A와 B가 주어졌을 때, 
//두 행렬을 더하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		int[][] sum = new int[n][m];
		
		for(int i=0 ; i<n ; i++) {
			String[] line = br.readLine().split(" ");
			for(int j=0 ; j<m ; j++) {
				arr1[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			String[] line = br.readLine().split(" ");
			for(int j=0 ; j<m ; j++) {
				arr2[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				bw.write(sum[i][j] + " ");
			}
			bw.append("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
