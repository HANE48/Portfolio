package boj11478;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
 * 문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
 * 부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
 * 예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, 
 * ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 
 * 서로 다른것의 개수는 12개이다.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashSet<String> set = new HashSet<String>();
		String str = br.readLine();
		int n = str.length();
		
		for(int i=0 ; i<n ; i++) {
			for(int j=i+1 ; j<=n ; j++) {
				set.add(str.substring(i,j));
				//map.put(str.substring(i,j), null);
			}
		}
		
		bw.write(Integer.toString(set.size()));
		//bw.write(Integer.toString(map.size()));
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main

}
