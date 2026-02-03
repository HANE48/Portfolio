package boj25305;

/*
 * 2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N명의 학생들이 응시했다.
 * 이들 중 점수가 가장 높은 k명은 상을 받을 것이다.
 * 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
 * 커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer in = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int ans = 0;
		int[] arr = new int[n];
		int cnt = 1;
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(in.nextToken());
		}
		
		Arrays.sort(arr);
		int i = arr.length-1;
		
		while(true) {
			if(cnt == k) {
				ans = arr[i];
				break;
			}
			
			cnt++;
			i--;
		}//while
		
		
		bw.write(Integer.toString(ans));
		bw.flush();
		br.close();
		bw.close();
	}//main

}
