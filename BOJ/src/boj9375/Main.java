package boj9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(n-->0) {
			int m = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			int count = 1;
			while(m-->0) {	//가진 의상의 수를 입력받음
				StringTokenizer st = new StringTokenizer(br.readLine());
				String clothes = st.nextToken();
				String type = st.nextToken();
				map.put(type, map.getOrDefault(type, 1)+1);	//타입이 같은게 몇개 들어왔는지만 확인
				
			}
			for(String str : map.keySet()) {
				count *= map.get(str);	//타입의 갯수만 곱하고 아무것도 안입는 경우는 없으니 -1해서 저장
				
			}
			sb.append(count-1).append("\n");
			
			
		}//while
		
		System.out.println(sb);
		
	}//main

}
