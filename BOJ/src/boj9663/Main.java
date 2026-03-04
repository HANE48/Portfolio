package boj9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[] arr;
	static boolean[][] visit;
	static int count = 0;
	
	public static void nQueen(int n, int depth) {
		
		if(depth == n) {
			count++;
			return ;
		}
		
		for(int i=0 ; i<n ; i++) {
			arr[depth] = i;				//인덱스를 열, 값을 행으로 취급
			if(possibility(depth)) {
				nQueen(n, depth+1);
			}
		}
		
	}
	
	public static boolean possibility(int col) {
		for(int i=0 ; i<col ; i++) {
			if(arr[col] == arr[i]) {
				return false;		//해당열의 행과 i열의 행이 일치할 경우
			}else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i])) {
				return false;		//열의 차와 행의 차가 같을 경우가 대각선에 놓인 경우
			}
	
		}//for
		
		return true;
	}//possibility
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];

		nQueen(n, 0);
		System.out.println(count);
		
	}//main

}
