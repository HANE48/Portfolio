package boj1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int count = 0;
		
		for(int i=0 ; i<n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int sta = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			arr[i][0] = sta;
			arr[i][1] = end;
			
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if(o2[1] == o1[1]) {
				return o1[0] - o2[0];
			}else {
				return o1[1] - o2[1];
			}
			
		});
		
		int endT = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i][0] >= endT) {
				count ++;
				endT = arr[i][1];
			}
		}
		
		System.out.println(count);
	}//main

}
