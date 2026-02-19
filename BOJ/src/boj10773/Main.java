package boj10773;

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
		Stack<Integer> st = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		st.push(-1);
		
		while(n-->0) {
			int a = Integer.parseInt(br.readLine());
			if(a==0) {
				st.pop();
			}else {
				st.push(a);
			}
		}
		
		while(true) {
			if(st.peek() == -1) {
				break;
			}
			sum += st.pop();
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
