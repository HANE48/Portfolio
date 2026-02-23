package boj18110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int cnt = 0;
		double sum = 0;
		double avg = 0;
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		double min = Math.round(n * 0.15);					//앞에서 15%까지 저장
		double max = n - min;								//n 에서 15%가 저장된 값을 뺀 값을 저장 후 배열의 맨 뒤에서부터 제거
		
		
		for(int i = 0 ; i<(int)min ; i++) {
			arr[i] = -1;
		}
		
		for(int i = arr.length-1 ; i >= (int)max ; i--) {
			arr[i] = -1;
		}
		
		for(int i: arr) {
			if(i == -1) {
				continue;
			}
			sum += i;
			cnt++;
		}
		
		avg = Math.round(sum / cnt);
		int res = (int)avg;
		bw.write(Integer.toString(res));
		
		bw.flush();
		bw.close();
		br.close();

	}//main

}
