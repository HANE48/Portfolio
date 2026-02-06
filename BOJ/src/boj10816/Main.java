package boj10816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 
 * 상근이는 숫자 카드 N개를 가지고 있다. 
 * 정수 M개가 주어졌을 때, 
 * 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		HashMap<Integer, Integer> map = new HashMap<>();
	
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		while(n-->0) {
			int k = Integer.parseInt(st.nextToken());
			if(map.containsKey(k)) {
				int cnt = map.get(k);
				map.put(k, ++cnt);
			}
			else {
				map.put(k, 1);
			}
		}//while
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		while(m-->0) {
			int k = Integer.parseInt(st.nextToken());
			if(!map.containsKey(k)) {
				bw.write("0 ");
			}else {
				bw.write(Integer.toString(map.get(k)) + " ");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();

	}//main

}
