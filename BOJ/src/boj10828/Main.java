package boj10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 다섯 가지이다.
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Stack<Integer> stack = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			String str =  st.nextToken();
			StringBuilder sb = new StringBuilder();
			if(st.hasMoreTokens()) {
				stack.push(Integer.parseInt(st.nextToken()));
				continue;
			}
			
			switch(str) {
			case "pop":
				sb.append(stack.isEmpty() ? -1 : stack.pop());
				break;
			case "size":
				sb.append(stack.size());
				break;
			case "empty":
				sb.append(stack.isEmpty() ? 1 : 0);
				break;
			case "top":
				sb.append(stack.isEmpty() ? -1 : stack.peek());
				break;
			}
			bw.append(sb + "\n");
			
		}//while
		
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
