package boj10830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static long[][] mul(long[][] m1, long[][] m2){
		long[][] res = new long[N][N];
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				for(int k=0 ; k<N ; k++) {
					res[i][j] = (res[i][j] + m1[i][k] * m2[k][j]) % 1000; 
				}
			}
		}
		return res;
		
	}
	
	public static long[][] pow(long[][] arr, long exp){
		if(exp == 1L) {
			return arr;
		}
		
		long[][] temp = pow(arr, exp/2);
		
		long[][] res = mul(temp, temp);
		if(exp % 2 != 0) {
			res = mul(res, arr);
		}
		
		return res;
	}//pow

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		long len = Long.parseLong(st.nextToken());
		long[][] arr = new long[N][N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<N ; j++) {
				arr[i][j] = Long.parseLong(st.nextToken()) % 1000;
			}
		}
		long[][] res = new long[N][N];
		res = pow(arr, len);
		
		StringBuilder sb = new StringBuilder();
		for(long[] fi: res) {
			for(long ans : fi) {
				sb.append(ans).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}//main

}
