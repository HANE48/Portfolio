package boj2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] visit = new boolean[101];
	static int[][] map;
	static int count = 0;
	static int n;
	
	static void dfs(int row) {
		
		visit[row] = true;
		
		for(int i=1 ; i<=n ; i++) {
			if(map[row][i] == 1 && !visit[i]) {
				count++;
				dfs(i);
			}
		}
	
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int link = Integer.parseInt(br.readLine());
		
		map = new int[n+1][n+1];
		while(link-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			map[i][j] = 1;
			map[j][i] = 1;

		}

		dfs(1);
		System.out.println(count);
	}//main

}
