package boj18258;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 여섯 가지이다.
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> qu = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		int back = 0;
		while(n-->0) {
			String res = null;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			if(st.hasMoreTokens()) {
				back = Integer.parseInt(st.nextToken());
				qu.add(back);
				continue;
			}
			
			switch(str) {
			case "pop":
				res = qu.isEmpty() ? "-1" : Integer.toString(qu.poll());
				break;
			case "size":
				res = Integer.toString(qu.size());
				break;
			case "empty":
				res = qu.isEmpty() ? "1" : "0";
				break;
			case "front":
				res = qu.isEmpty() ? "-1" : Integer.toString(qu.peek()) ;
				break;
			case "back":
				res = qu.isEmpty() ? "-1" : Integer.toString(back);
				break;
			}
			
			bw.write(res + "\n");
			
		}//while
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
