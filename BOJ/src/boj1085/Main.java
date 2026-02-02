package boj1085;

/*
 * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 
 * 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
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
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int min = x;
		
		if(y<min) {
			min = y;
		}
		if(w-x<min) {
			min = w-x;
		}
		if(h-y<min) {
			min = h-y;
		}
		
		bw.write(Integer.toString(min));
		bw.flush();
		br.close();
		bw.close();
		
		
	}//main

}
