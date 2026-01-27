package boj2566;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = 0, row=1, column=1;
		
		for(int i=0 ; i<9 ; i++) {
			String[] input = br.readLine().split(" ");
			for(int j=0 ; j<9 ; j++) {
				if(max<Integer.parseInt(input[j])) {
					max = Integer.parseInt(input[j]);
					row = i + 1;
					column = j + 1;
				}
			}
		}
		
		bw.write(max + "\n" + row + " " + column);
		bw.flush();
		bw.close();
		br.close();
	}//main

}
