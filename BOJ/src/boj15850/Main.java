package boj15850;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static boolean[] visit;
	static int[] arr;
	
	public static void dfs(int n, int m, int at, int depth) {
		if(depth == m) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=at ; i<n ; i++) {
			if(visit[i] == false) {			//방문을 하지 않은 노드면
				visit[i] = true;			//방문한 상태로 만든 후
				arr[depth] = i+1;			//depth값을 index로해서 arr에 i+1저장
				dfs(n, m, i+1, depth + 1);	//i+1부터 탐색하도록 
				visit[i] = false;			//방문하지 않은 상태로 변경
			}
		}
		return ;
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visit = new boolean[n];
		arr = new int[m];
		
		dfs(n, m, 0, 0);
		
	}//main

}
