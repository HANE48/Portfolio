package boj1764;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> sorted = new HashMap<String, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		while(n-->0) {
			String name = br.readLine();
			map.put(name, 0);
		}
		
		while(m-->0) {
			String name = br.readLine();
			if(map.containsKey(name)) {
				sorted.put(name, 0);
			}else {
				map.put(name, 0);
			}
		}
		
		List<String> keySet = new ArrayList<String>(sorted.keySet());
		keySet.sort((s1, s2)->s1.compareTo(s2));
		
		bw.write(Integer.toString(sorted.size()) + "\n");
		
		for(String i: keySet) {
			bw.append(i + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
