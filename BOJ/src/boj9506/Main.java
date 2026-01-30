package boj9506;

/*
 * 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
 * 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
 * n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) {
				break;
			}
			
			int[] arr = new int[n];
			int sum = 0;
			
			for(int i=1 ; i<=n ; i++) {
				if(n % i == 0 && i != n) {
					arr[i] = i;
					sum += i;
				}
			}
			
			if(sum != n) {
				bw.write(n + " is NOT perfect. \n");
				continue;
			}
			
			bw.append(n + " = 1");
			for(int i=1 ; i<=n ; i++) {
				if(arr[i-1] != 0 && arr[i-1] != 1 ) {
					bw.append(" + " + arr[i-1]);
				}
			}
			
			bw.append("\n");
			
			
		}//for
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
