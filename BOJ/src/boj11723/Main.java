package boj11723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

/*
 * 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
 * add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
 * remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
 * check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
 * toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
 * all: S를 {1, 2, ..., 20} 으로 바꾼다.
 * empty: S를 공집합으로 바꾼다.
 */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		TreeSet<Integer> set = new TreeSet<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch(str) {
			case "add":
				int add = Integer.parseInt(st.nextToken());
				set.add(add);
				break;
			case "remove":
				int rm = Integer.parseInt(st.nextToken());
				if(set.contains(rm)) {
					set.remove(rm);
				}
				break;
			case "check":
				int chk = Integer.parseInt(st.nextToken());
				if(set.contains(chk)) {
					bw.append("1\n");
				}else {
					bw.append("0\n");
				}
				break;
			case "toggle":
				int tgl = Integer.parseInt(st.nextToken());
				if(set.contains(tgl)) {
					set.remove(tgl);
				}else {
					set.add(tgl);
				}
				break;
			case "all":
				for(int i=1 ; i<=20 ; i++) {
					set.add(i);
				}
				break;
				
			case "empty":
				set.clear();
				break;
				
			}//switch
			
			
		}//while
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
