package boj1620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, String> map1 = new HashMap<>();	//value가 포켓몬으로 저장
		HashMap<String, Integer> map2 = new HashMap<>();	//value가 숫자로 저장
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=1 ; i<=n ; i++) {
			String s = br.readLine();
			map1.put(Integer.toString(i), s);
			map2.put(s, i);
		}
		
		while(m-->0) {
			String s = br.readLine();
			if('0' <= s.charAt(0) && s.charAt(0) <= '9') {
				bw.write(map1.get(s) + "\n");
			}else {
				bw.write(map2.get(s) + "\n");
			}
			
		}//while
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main

}
