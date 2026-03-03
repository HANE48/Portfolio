package boj20920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		
		while(n-->0) {
			
			String str = br.readLine();
			
			if(str.length() < len) {
				continue;
			}
			
			//단어가 얼마나 자주나오는지 확인
			map.put(str, map.getOrDefault(str, 0) + 1);
			
		}//while
		
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//자주 등장하는 순서대로 정렬
				//Integer.compare의 경우 비교해서 같으면 0을 o1이크면 1 o2이 크면 -1을 리턴
				if(Integer.compare(map.get(o1), map.get(o2)) != 0) {
					return Integer.compare(map.get(o2), map.get(o1));
				}
				//등장 횟수가 같으면 길이가 긴 단어가 먼저 오게
				if(o1.length() != o2.length()) {
					return o2.length() - o1.length();
				}
				//둘 다 같으면 사전순으로 정렬
				return o1.compareTo(o2);
			}//compare
			
			
		});
		
		StringBuilder sb = new StringBuilder();
		for(String str : list) {
			sb.append(str).append("\n");
		}
		System.out.println(sb);
		
	}//main

}