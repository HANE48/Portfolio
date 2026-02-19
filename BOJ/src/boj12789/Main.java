package boj12789;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		boolean res = true;
		int[] arr = new int[n];
		int cnt = 1;
		
		for(int i = 0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}

		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] != cnt) {
				if(!st.isEmpty() && st.peek()==cnt) {
					st.pop();
					i--;
					cnt++;
				}else {
					st.push(arr[i]);
				}
			}else {
				cnt++;
			}
		}//for
		
		for(int i=0 ; i<st.size() ; i++) {
			int temp = st.pop();
			
			if(temp == cnt) {
				cnt++;
			}else {
				res = false;
				break;
			}
		}
		
		if(res) {
			bw.write("Nice");
		}else {
			bw.write("Sad");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
