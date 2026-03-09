package boj1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		int min = 1;
		int max = Integer.MIN_VALUE;
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		
		long start = 1;
		long end = max;
		long res = 0;
		
		while(start <= end) {
			long mid = (start + end) / 2;
			long count = 0;
			
			for(int i=0 ; i<n ; i++) {	//랜선의 갯수를 세는 부분
				count += (arr[i]/mid);
			}
			
			if(count >= len) {		//만약 갯수가 len보다 크거나 같다면 더 길게 잘라봄
				res = mid;
				start = mid + 1;	//절반부터 시작해 끝까지 탐색
			}else {					//갯수가 len 보다 작다면
				end = mid - 1;		//처음부터 절반까지 탐색
			}
			
		}//while
		
		System.out.println(res);
		
		
	}//main

}
