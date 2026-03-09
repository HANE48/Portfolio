package boj9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	//1차원 배열로 만들어 arr[i] = j 일때 i행 j열에 퀸이 있음을 나타냄
	//같은 행에 퀸이 여러개 놓이는 경우는 배제하고 시작할 수 있음
	static int[] arr;
	static boolean[][] visit;
	static int count = 0;
	static int n;
	
	public static void dfs(int depth) {
		if(depth == n) {
			count++;
			return;
		}
		
		for(int i=0 ; i<n ; i++) {
			arr[depth] = i;
			if(isPossible(depth, i)) {
				dfs(depth+1);
			}
		}
		
		
	}
	
	
	static boolean isPossible(int row, int col ) {
		for(int i=0 ; i<row ; i++) {
			if(arr[i] == col) {
				return false;
			}
			if(Math.abs(row - i) == Math.abs(col - arr[i])) {
				return false;
			}
		}
		
		return true;
	}


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];

		dfs(0);
		System.out.println(count);
		
	}//main

}
