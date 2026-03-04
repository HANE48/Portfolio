package boj15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] visit;
	static int[] arr;
	
	public static void dfs(int n, int m, int depth) {
		//재귀 깊이가 m 과 같으면 배열에 담은 값을 출력
		if(depth == m) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return ;
		}//if
		
		for(int i=0 ; i<n ; i++) {
			if(visit[i] == false) {
				visit[i] = true;		//해당 노드를 방문한 상태로 변경
				arr[depth] = i+1;		//해당 깊이를 index로해 i+1값 저
				dfs(n, m, depth + 1);	//다음 자식노드 방문을 위해 depth 1증가시키며 재귀호출
				visit[i] = false;		//자식노드 방문이 끝나면 방문한 노드를 방문하지 않은 상태로 변경
			
			}
		}
		return ;
		
	}//dfs
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visit = new boolean[n];
		arr = new int[m];
		
		dfs(n,m,0);
		
	}//main

}
