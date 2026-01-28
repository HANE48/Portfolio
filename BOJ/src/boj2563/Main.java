package boj2563;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 
 * 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를
 * 색종이의 변과 도화지의 변이 평행하도록 붙인다.
 * 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후
 * 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
 * 
 * 겹치는 부분만 구해서 "총 색종이 넓비 - 겹치는 넓이"
 * 
 * 겹치는 넓이 == x가 겹치면서 y가 겹치는넓이의 최대 - 초
 * 
 */


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[][] arr = new int[101][101];
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			for(int j=n1 ; j<n1+10 ; j++) {
				for(int k=n2 ; k<n2+10 ; k++) {
					if(arr[j][k]==0) {
						arr[j][k] = 1;
					}
				}//inner
			}//outer
		}//mainFor
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[i][j] == 1) {
					sum += arr[i][j];
				}
			}
		}

		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main

}
