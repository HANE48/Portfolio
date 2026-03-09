package boj14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] visit;
	static int[][] arr;
	static int result = Integer.MAX_VALUE;
	static int n;
	
	public static void dfs(int index, int depth) {
		// n/2만 선택하면 나머지는 자동선택이므로 n/2까지만 탐색
		if(depth == n/2) {
			diff();
			return;
		}
		
		for(int i=index ; i<n ; i++) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(i + 1, depth + 1);
				visit[i] = false;
			}
		}
		
		
	}
	
	
	public static void diff() {
		int teamStart = 0;
		int teamLink = 0;
		
		for(int i=0 ; i<n-1 ; i++) {
			for(int j = i+1 ; j<n ; j++) {
				if(visit[i] && visit[j]) {
					teamStart += arr[i][j] + arr[j][i];
				}else if(!visit[i] && !visit[j]) {
					teamLink += arr[i][j] + arr[j][i];
				}
			}
		}
		
		int val = Math.abs(teamStart - teamLink);
		
		result = Math.min(val, result);
		
		if(result == 0) {
			System.out.println(result);
			System.exit(0);
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n];
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<n ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
		
		System.out.println(result);
		
	}//main

}
