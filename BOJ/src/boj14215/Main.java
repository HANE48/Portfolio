package boj14215;

/*
 * 영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
 * 영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
 * 각 막대의 길이는 양의 정수이다
 * 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
 * 삼각형의 둘레를 최대로 해야 한다.
 * a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오. 
 * 
 * 삼각형의 조건
 * 세 변의 길이가 다르며 가장 큰 변이 나머지 두 변의 합보다 작다
 * 두 변의 길이가 같다
 * 세 변의 길이가 같다
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
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int n3 = Integer.parseInt(st.nextToken());
		int circ = 0;
		int flag = 0;
		
		
		if(n1 != n2 && n2 != n3) {
			flag++;
		}else if(n1>=n2+n3 || n2>=n1+n3 || n3>=n1+n2) {
			flag++;
		}
		
		
		
		if(flag>0) {		//세 변의 길이가 다르며 가장 큰 변의 길이가 나머지 두 변의 길이보다 긴 경우
			if(n1>n2 && n1>n3) {				//n1이 가장 긴  경우
				for(int i=n1 ; i>0 ; i--) {
					if(i==n2 || i == n3) {	//가장 긴 막대의 길이를 줄이다 다른 막대랑 길이가 같아진 경우
						n1 = i;
						break;
					}
					if(i<n2+n3) {				//삼각형의 조건을 만족한 경우
						n1 = i;
						break;
					}
				}
				
			}else if(n2>n3) {		//n2가 가장 긴 경우
				for(int i = n2 ; i>0 ; i--) {
					if(i == n1 || i == n3 ) {
						n2 = i;
						break;
					}
					if(i<n1+n3) {
						n2 = i;
						break;
					}
				}
					
			}else {					//n3가 가장 긴 경우
				for(int i = n3 ; i>0 ; i--) {
					if(i == n1 || i == n2 ) {
						n3 = i;
						break;
					}
					if(i<n1+n2) {
						n3 = i;
						break;
					}
				}
			}
		}//if
		
		circ = n1 + n2 + n3;
		bw.write(Integer.toString(circ));
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
