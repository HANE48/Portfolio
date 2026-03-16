package boj6549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long[] arr;
	static long min = Long.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			min = Long.MAX_VALUE;
			if(n==0) {
				break;
			}
			
			arr = new long[n];
			for(int i=0 ; i<arr.length ; i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			
			sb.append(divide(0, n-1)).append("\n");
			
		}//while
		
		System.out.println(sb);
		
	}//main

	static long divide(int left, int right) {
		if(left == right) {
			return arr[left];
		}
		//나누는 부분
		int mid = (left+right) / 2;
		long maxArea = Math.max(divide(left, mid), divide(mid+1, right));
		//합치는 부분
		maxArea = Math.max(maxArea, getMidArea(left, right, mid));
		
		return maxArea;
		
	}//divide

	static long getMidArea(int left, int right, int mid) {
		int lo = mid;
		int hi = mid+1;
		
		long height = Math.min(arr[lo], arr[hi]);
		long maxArea = height * 2;
		
		while(left < lo || hi < right) {
			
			//오른쪽으로 확장할 조건
			//1. hi가 아직 right 미만이어야 함
			//2. lo가 이미 left에 도달했거나, 오른쪽 칸(arr[hi+1])이 왼쪽 칸(arr[lo-1])보다 높을 때
			if(hi < right && (lo == left || arr[lo-1]<arr[hi+1])){
				hi++;
				height = Math.min(height,  arr[hi]);
			}else {	//왼쪽으로 확장할 조건
				lo--;
				height = Math.min(height, arr[lo]);
			}
			//확장 후 새로운 넓이 계산해서 최댓값 갱신
			maxArea = Math.max(maxArea, height * (hi - lo +1));
			
		}//while
		
		return maxArea;
	}//getMidArea
	
}
