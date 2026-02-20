package boj28279;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
 * 정수를 저장하는 덱을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 여덟 가지이다.
 * 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
 * 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
 * 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 5: 덱에 들어있는 정수의 개수를 출력한다.
 * 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
 * 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 * 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 * 
 * deque.addFirst(); 	// Deque의 앞쪽에 데이터를 삽입, 용량 초과시 Exception
 * deque.offerFirst(); 	// Deque의 앞쪽에 데이터를 삽입 후 true, 용량 초과시 false
 *
 * deque.addLast(); 	// Deque의 뒤쪽에 데이터를 삽입, 용량 초과시 Exception
 * deque.add(); 		// addLast()와 동일
 * deque.offerLast(); 	// Deque의 뒤쪽에 데이터를 삽입 후 true, 용량 초과시 false
 * deque.offer(); 		// offerLast()와 동일
 *
 * deque.push(); // addFirst()와 동일
 * deque.pop(); // removeFirst()와 동일
 * 
 * deque.removeFirst(); // Deque의 앞에서 제거, 비어있으면 예외
 * deque.remove(); 		// removeFirst()와 동일
 * deque.poll(); 		// Deque의 앞에서 제거, 비어있으면 null 리턴
 * deque.pollFirst(); 	// poll()과 동일

 * deque.removeLast(); 	// Deque의 뒤에서 제거, 비어있으면 예외
 * deque.pollLast(); 	// Deque의 뒤에서 제거, 비어있으면 null 리턴
 */


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Deque<Integer> deque = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int res = 0;
			if(st.hasMoreTokens()) {
				if(a == 1) {
					deque.addFirst(Integer.parseInt(st.nextToken()));
					continue;
				}else {
					deque.addLast(Integer.parseInt(st.nextToken()));
					continue;
				}
			}
			
			switch(a) {
				case 3:
					res = deque.isEmpty() ? -1 : deque.poll();
					break;
				case 4:
					res = deque.isEmpty() ? -1 : deque.pollLast();
					break;
				case 5:
					res = deque.size();
					break;
				case 6:
					res = deque.isEmpty() ? 1 : 0;
					break;
				case 7:
					res = deque.isEmpty() ? -1 : deque.peekFirst();
					break;
				case 8:
					res = deque.isEmpty() ? -1 : deque.peekLast();
					break;

			}//switch
			
			bw.append(Integer.toString(res) + "\n");

		}//while
		
		bw.flush();
		bw.close();
		bw.close();

	}//main

}
