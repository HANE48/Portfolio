package boj26069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<String>();
		StringTokenizer st;
		set.add("ChongChong");
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(n-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			String f = st.nextToken();
			String r = st.nextToken();
			
			if(set.contains(f) || set.contains(r)) {
				set.add(f);
				set.add(r);
			}
		}//while
		
		System.out.println(set.size());
		
	}//main

}
