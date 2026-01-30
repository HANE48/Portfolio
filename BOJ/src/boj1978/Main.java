package boj1978;

//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean isPrime(int n) {		//입력받은 수를 소수이면 참을 아니면 거짓을 반환함
		if(n <= 1) {
			return false;
		}
		for(int i=2 ; i<= Math.sqrt(n) ; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, max=0, cnt=0;
		
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]>max) {
				max = arr[i];
			}
		}//for
		
		for(int i=0 ; i<n ; i++) {
			if(isPrime(arr[i])) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
