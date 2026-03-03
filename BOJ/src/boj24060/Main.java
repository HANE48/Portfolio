package boj24060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int[] arr;
	static int[] tmp;
	static int res = -1;
	static int cnt = 0;
	static int k;
	
	public static void mergeSort(int[] arr, int s, int l) {
		
		if(s < l) {
			int q = (s+l)/2;
			mergeSort(arr, s, q);
			mergeSort(arr, q+1, l);
			merge(arr, s, q, l);
		}
		
	}
	
	public static void merge(int[] arr, int s, int m, int l) {
		int i = s;
		int j = m+1;
		int t = 0;
		
		while(i <= m && j<= l) {	
			if(arr[i]< arr[j]) {
				tmp[t++] = arr[i++];
			}
			else {
			tmp[t++] = arr[j++];
			}
		}//while
		
		while(i <= m) {		//왼쪽 배열이 남은 경우
			tmp[t++] = arr[i++]; 
		}
		
		while(j <= l) {		//오른쪽 배열이 남은 경우
			tmp[t++] = arr[j++];
		}
		
		i = s;
		t = 0;
		while(i <= l) {		//결과를 배열에 저장
			cnt++;
			
			if(cnt == k) {
				res = tmp[t];
				return ;
			}
			
			arr[i++] = tmp[t++];
		}//while
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer as = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		tmp = new int[arr.length];
		int i=0;
		
		while(n-->0) {
			arr[i++] = Integer.parseInt(as.nextToken());		
		}
		
		mergeSort(arr, 0, arr.length-1);
		System.out.println(res);
	}//main
	
}
