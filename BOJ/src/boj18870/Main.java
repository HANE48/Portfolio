package boj18870;

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
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		int[] sorted;
		for(int i=0 ; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sorted = arr.clone();
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer>map = new HashMap<>();
		
		int i=0;
		for(int a: sorted) {
			if(!map.containsKey(a)) {
				map.put(a, i++);
			}
		}
		
		for(int a: arr) {
			bw.write(Integer.toString(map.get(a)) + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}//main
	
}
