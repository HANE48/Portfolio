package boj19532;

/*
 * ax + by = c
 * dx + ey = f
 * 일때 a b c d e f 가 주어지면 x와 y값을 출력하시오
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int x = 0;
		int y = 0;
		
		for(int i=-999 ; i<1000 ; i++) {
			for(int j=-999 ; j<1000 ; j++) {
				if((a*i)+(b*j) == c && (d*i) + (e*j) == f) {
					x=i;
					y=j;
					break;
				}
			}
		}
		bw.write(Integer.toString(x) + " " + Integer.toString(y));
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
