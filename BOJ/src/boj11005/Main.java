package boj11005;


/*
 * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		ArrayList<Character> list = new ArrayList<>();
		
		while(n>0) {
			
			if(n%b < 10) {
				list.add((char) (n%b+'0'));
			}else {
				list.add((char)(n%b-10+'A'));
			}
			n /= b;
			
		}
		
		for(int i=list.size()-1 ; i >= 0 ; i--) {
			bw.write(Character.toString(list.get(i)));
		}
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
