package boj10815;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 
 * 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 
 * 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<n ; i++) {
			map.put(st.nextToken(), 0);
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<m ; i++) {
			if(map.get(st.nextToken()) != null) {
				bw.append("1 ");
			}else {
				bw.append("0 ");
			}
			
		}

		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
