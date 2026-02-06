package boj1269;

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
		HashMap<String, String> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		while(n-- > 0) {
			map.put(st.nextToken(), "0");
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		while(m-- > 0) {
			String str = st.nextToken();
			if(!map.containsKey(str)) {
				map.put(str, "0");
			}else {
				map.remove(str);
			}
		}
		
		bw.write(Integer.toString(map.size()));
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main

}
