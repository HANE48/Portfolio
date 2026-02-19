package boj4949;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st;
		
		while(true) {
			String str = br.readLine();
			st = new Stack<Integer>();
			
			if(str.length() == 1 && str.equals(".")) {
				break;
			}
			
			for(int i=0 ; i<str.length() ; i++) {
				if(str.charAt(i) == '(') {
					st.push(1);
				}
				if(str.charAt(i) == '[') {
					st.push(2);
				}
				
				if(str.charAt(i) == ')') {
					if(!st.isEmpty() && st.peek() == 1) {
						st.pop();
					}else {
						st.push(-1);
						break;
					}
				}
				
				if(str.charAt(i) == ']') {
					if(!st.isEmpty() && st.peek() == 2) {
						st.pop();
					}else {
						st.push(-1);
						break;
					}
				}
				

			}//for
			if(st.size()==0) {
				bw.append("yes\n");
			}else {
				bw.append("no\n");
			}

		}//while
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
