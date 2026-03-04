package boj2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 분할정복 알고리즘
 * -> 가운데를 size/3만큼 비운 후 
 * -> size/3 의 가운데를 size/3/3만큼 비우며 
 * size가 1이 될 때 까지 반복
 */

public class Main {
	static char[][] arr;
	
	public static void star(int x, int y, int n, boolean blank) {
		//공백을 채워야 하는 칸일경우
		if(blank) {
			for(int i=x ; i<x+n ; i++) {
				for(int j = y; j<y+n ; j++) {
					arr[i][j] = ' ';
				}
			}//for
			return ;
		}
		
		//더이상 쪼갤수 없는 블럭일 때
		if(n==1) {
			arr[x][y] = '*';
			return ;
		}
		
		int size = n/3;
		int count = 0;
		
		for(int i=x ; i<x+n ; i += size) {
			for(int j=y ; j<y+n ; j += size) {
				count++;
				if(count == 5) {		//공백을 채울 차례인 경우
					star(i,j,size, true);
				}
				
				else {					//*을 채울 차례인 경우
					star(i,j,size, false);
				}
			}
		}
		
	}//star
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new char[n][n];
		star(0, 0, n, false);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
