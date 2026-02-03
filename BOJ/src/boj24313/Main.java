package boj24313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int f(int a1, int a0, int n) {
		return (a1*n)+a0;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		int flag = 1;
		
		for(int i=n0 ; i<=100 ; i++) {
			if(!(f(a1, a0, i) <= c*i)) {
				flag--;
				break;
			}
		}
		
		if(flag != 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		br.close();
		
		
	}//main

}
