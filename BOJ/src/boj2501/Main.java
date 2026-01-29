package boj2501;

/*
 * 두 개의 자연수 N과 K가 주어졌을 때, 
 * N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		
		
		for(int i=1 ; i<=n ; i++) {
			if(n % i == 0) {
				k--;
			}
			if(k==0) {
				bw.write(Integer.toString(i));
				bw.flush();
				br.close();
				bw.close();
				System.exit(0);
			}
		}
		
		bw.write("0");
		bw.flush();
		br.close();
		bw.close();
		
		
	}//main

}
