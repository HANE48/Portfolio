package boj4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str = br.readLine()) != null) {
			sb = new StringBuilder();
			
			int n = Integer.parseInt(str);
			n = (int) Math.pow(3, n);
			
			for(int i=0 ; i<n ; i++) {
				sb.append("-");
			}
			func(0, n);
			System.out.println(sb);
			
		}//while		
	}//main
	
	public static void func(int start, int size) {
		
		if(size == 1) {
			return;
		}
		
		int newSize = size/3;
		
		for(int i = start + newSize ; i<start+(2*newSize) ; i++) {
			sb.setCharAt(i, ' ');
		}
		
		func(start, newSize);
		func(start+(2*newSize), newSize);
		
	}
	

}
