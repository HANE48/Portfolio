package boj1346;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Deque<int[]> deque = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		bw.append("1 ");
		int move = Integer.parseInt(st.nextToken());
		
		for(int i=2 ; i<=n ; i++) {
			deque.add(new int[] {i, Integer.parseInt(st.nextToken())});
		}
		
		while(!deque.isEmpty()) {
			if(move>0) {
				
				for(int i=1 ; i<move ; i++) {
					deque.add(deque.pollFirst());
				}
				int[] next = deque.removeFirst();
				move = next[1];
				bw.append(Integer.toString(next[0]) + " ");
			}else {
				for(int i=move ; i<-1 ; i++) {
					deque.addFirst(deque.pollLast());
				}
				int[] next = deque.removeLast();
				move = next[1];
				bw.append(Integer.toString(next[0]) + " ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
