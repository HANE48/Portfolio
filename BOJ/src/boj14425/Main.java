package boj14425;

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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap<String, Integer> map = new HashMap<>();
		int cnt = 0;
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for(int i=0 ; i<n ; i++) {
			map.put(br.readLine(), 0);
		}
		
		for(int i=0 ; i<m ; i++) {
			if(map.containsKey(br.readLine())) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
