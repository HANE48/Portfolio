package boj9012;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st;
		
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			String str = br.readLine();
			st = new Stack<Integer>();
			for(int i=0 ; i<str.length() ; i++) {
				if(str.charAt(i) == '(') {
					st.push(1);
				}
				else if(str.charAt(i) == ')') {
					if(st.isEmpty()) {
						st.push(1);
						break;
					}
					st.pop();
				}
			}//for
			
			if(st.isEmpty()) {
				bw.append("YES\n");
			}else {
				bw.append("NO\n");
			}
			
		}//while
		
		bw.flush();
		bw.close();
		br.close();
	
	}//main

}
