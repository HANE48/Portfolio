package boj28278;

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
 * 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
 * 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 3: 스택에 들어있는 정수의 개수를 출력한다.
 * 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			StringTokenizer s = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(s.nextToken());
			if(s.hasMoreTokens()) {
				st.push(Integer.parseInt(s.nextToken()));	
			}else {	
				switch(a) {
				case 2:
					if(st.isEmpty()) {
						bw.append("-1\n");
					}else{
						bw.append(Integer.toString(st.pop()) + "\n");
					}
					break;		
				case 3:
					bw.append(Integer.toString(st.size()) + "\n");
					break;
				case 4:
					if(st.isEmpty()) {
						bw.append("1\n");
					}else {
						bw.append("0\n");
					}
					break;
				case 5:
					if(st.isEmpty()) {
						bw.append("-1\n");
					}else {
						bw.append(Integer.toString(st.peek()) + "\n");
					}
					break;
					
				}//if
				
			}//switch
			
		}//while
		bw.flush();
		br.close();
		bw.close();

	}//main

}
