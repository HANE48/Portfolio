package boj10814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * 숫자 배열 + 문자열 배열을 숫자 배열에 맞춰 정렬
 */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		for(int i=0 ; i<arr.length ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();		//나이
			arr[i][1] = st.nextToken();		//이름
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
			}
		});
		
		for(int i=0 ; i<arr.length ; i++) {
			bw.append(arr[i][0] + " " + arr[i][1] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}// main

}
