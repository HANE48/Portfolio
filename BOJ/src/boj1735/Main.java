package boj1735;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int GCD(int n, int m) {
		if(n%m==0) {
			return m;
		}
		return GCD(m, n%m);
	}
	
	public static int[] Fraction(int c1, int p1) {
		int[] frac = new int[2];
		frac[0] = c1;
		frac[1] = p1;
		
		int gcd_res = GCD(frac[0], frac[1]);	
		
		frac[0] /= gcd_res;
		frac[1] /= gcd_res;
		
		return frac;
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int c1 = Integer.parseInt(st.nextToken());
		int p1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int c2 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		
		int[] b1 = new int[2];
		int[] b2 = new int[2];
		
		b1[0] = c1 * p2;	
		b2[0] = c2 * p1;
		
		b1[1] = p1 * p2;
		b1[0] += b2[0];
		
		b1 = Fraction(b1[0], b1[1]);
		
		
		bw.write(Integer.toString(b1[0]) + " " + Integer.toString(b1[1]));
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
