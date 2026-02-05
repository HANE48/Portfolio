package boj1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
 * 길이가 짧은 것부터
 * 길이가 같으면 사전 순으로
 * 단, 중복된 단어는 하나만 남기고 제거해야 한다.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String[] str;
		int n = Integer.parseInt(br.readLine());
		str = new String[n];
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine());
			str[i] = st.nextToken();
		}
		
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		bw.write(str[0] + "\n");
		for(int i=1 ; i<str.length ; i++) {
			if(str[i].equals(str[i-1])) {
				continue;
			}
			bw.write(str[i] + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}//main

}
