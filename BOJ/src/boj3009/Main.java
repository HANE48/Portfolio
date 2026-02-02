package boj3009;

/*
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
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
		StringTokenizer st;
		int[][] arr = new int[3][2];
		int[] chk = new int[2];
		
		for(int i=0 ; i<arr.length ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		if(arr[0][0] == arr[1][0]) {
			chk[0] = arr[2][0];
		}else if(arr[0][0] == arr[2][0]) {
			chk[0] = arr[1][0];
		}else {
			chk[0] = arr[0][0];
		}
		
		if(arr[1][1] == arr[0][1]) {
			chk[1] = arr[2][1];
		}else if(arr[0][1] == arr[2][1]) {
			chk[1] = arr[1][1];
		}else {
			chk[1] = arr[0][1];
		}
		
		bw.write(Integer.toString(chk[0]) + " " + Integer.toString(chk[1]));
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
