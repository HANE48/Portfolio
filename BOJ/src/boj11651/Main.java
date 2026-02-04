package boj11651;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 2차원 배열을 입력받아 좌표를 정렬하여 출력
 * 그러나 y좌표가 증가하는 순으로 출력하며 y가 같으면 x가 증가하는 순으로 정렬
 */


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}//for
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}else {
				return e1[1] - e2[1];
			}
		});
		
		for(int i=0 ; i<arr.length ;i++) {
			bw.append(Integer.toString(arr[i][0]) + " " + Integer.toString(arr[i][1]) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}