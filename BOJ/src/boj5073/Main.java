package boj5073;

/*
 * 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
 * Equilateral :  세 변의 길이가 모두 같은 경우
 * Isosceles : 두 변의 길이만 같은 경우
 * Scalene : 세 변의 길이가 모두 다른 경우
 * 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 
 * 예를 들어 6, 3, 2가 이 경우에 해당한다. 
 * 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
 * 세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
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
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			int n3 = Integer.parseInt(st.nextToken());
			int max = n1;
			if(n1 == 0 && n2 == 0 && n3 == 0) {
				bw.flush();
				bw.close();
				br.close();
				break;
			}
			
			if(max < n2 || max<n3) {
				if(max < n3) {		//n3가 가장 길 경우
					max = n3;
					
					if(max<n1+n2) {
						if(n1 == n2 && n2==n3 && n1 == n3) {
							bw.append("Equilateral\n");
						}else if(n1 == n2 || n2 == n3 || n1 == n3) {
							bw.append("Isosceles\n");
						}else {
							bw.append("Scalene\n");
						}
					}//if
					else {
						bw.append("Invalid\n");
					}
					
				}
				else {				//n2가 가장 길 경우
					max = n2;
					if(max<n1+n3) {
						if(n1 == n2 && n2==n3 && n1 == n3) {
							bw.append("Equilateral\n");
						}else if(n1 == n2 || n2 == n3 || n1 == n3) {
							bw.append("Isosceles\n");
						}else {
							bw.append("Scalene\n");
						}
					}//if
					else {
						bw.append("Invalid\n");
					}
				}
			}else {					//n1이 가장 길 경우
				if(max<n3+n2) {
					if(n1 == n2 && n2==n3 && n1 == n3) {
						bw.append("Equilateral\n");
					}else if(n1 == n2 || n2 == n3 || n1 == n3) {
						bw.append("Isosceles\n");
					}else {
						bw.append("Scalene\n");
					}
				}//if
				else {
					bw.append("Invalid\n");
				}
			}//else
			
		}//while
		
		
	}//main

}
