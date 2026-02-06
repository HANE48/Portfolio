package boj13241;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static long GCD(long n, long m) {
		if(n%m == 0) {
			return m;
		}else {
			return GCD(m, n%m);
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		bw.write(Long.toString(n*m/GCD(n,m)));
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
