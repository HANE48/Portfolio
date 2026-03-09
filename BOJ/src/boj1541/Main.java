package boj1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-를 기준으로 나눔
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int[] arr = new int[st.countTokens()];
		
		for(int i=0 ; i<arr.length ; i++) {
			//+를 기준으로 다시 나눔
			StringTokenizer ss = new StringTokenizer(st.nextToken(), "+");
			int a = Integer.parseInt(ss.nextToken());
			//토큰이 남았을 경우
			if(ss.hasMoreTokens()) {
				//토큰이 없을 떄 까지 값을 더해줌
				while(ss.hasMoreTokens()) {
					a += Integer.parseInt(ss.nextToken());
				}
			}
			arr[i] = a;
		}
		
		int res = arr[0];
		for(int i=1 ; i<arr.length ; i++) {
			res -= arr[i];
		}
		
		System.out.println(res);
		
	}//main

}
