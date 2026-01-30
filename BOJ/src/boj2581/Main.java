package boj2581;

/*
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라
 * 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중
 * 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
 * 이들 소수의 합은 620이고, 최솟값은 61이 된다.
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
		int arr[];
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int cnt = 0, sum = 0, min = 2147483647;
		
		arr = new int[n+1];
		
		for(int i=2 ; i<=n ; i++) {
			arr[i] = i;
		}//for
		
		for(int i=2 ; i<=n ; i++) {
			if(arr[i] == 0) {
				continue;
			}
			for(int j=i*i ; j<=n ; j += i) {
				arr[j] = 0;
			}
		}//for
		
		for(int i=m ; i<=n ; i++) {
			if(arr[i] != 0) {
				cnt++;
				if(min>arr[i]) {
					min = arr[i];
				}
				sum += arr[i];
			}
		}
		
		if(cnt == 0) {
			bw.write("-1");
			
		}else {
			bw.write(Integer.toString(sum) + "\n" + Integer.toString(min));
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
