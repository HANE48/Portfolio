package boj1316;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.	
 */

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()), count=0;
		for(int i=0 ; i<n ; i++) {
			String s = br.readLine();
			int arr[] = new int[125];
			
			for(int j=97 ; j<123 ; j++) {
				arr[j] = 0;
			}
			
			for(int j=0 ; j<s.length() ;) {
				
				if(j+1>=s.length()) {
					if(s.charAt(j) == s.indexOf(j-1, j+1)) {
						break;
					}
					else {
						arr[(int)s.charAt(j)] += 1;
						break;
					}
				}
				if(s.charAt(j) == s.charAt(j+1)) {
					arr[(int)s.charAt(j)] += 1;
					while(s.charAt(j) == s.charAt(j+1)){
						j++;
						if(j+1>=s.length()) {
							break;
						}
					}
					if(j+1>=s.length()) {
						break;
					}else if(s.charAt(j)!= s.charAt(j+1)) {
						j++;
					}
				}else if(s.charAt(j) != s.charAt(j+1)) {
					arr[(int)s.charAt(j)] += 1;
					j+=1;
				}
			}//inner
			
			for(int j=97 ; j<123 ; j++) {
				if(arr[j]>1) {
					break;
				}
				if(j==122 && (arr[j]==1 || arr[j]==0)) {
					count++;
				}
			}
			
		}//outer for
		
		bw.write(Integer.toString(count));
		bw.flush();
		br.close();
		bw.close();
	}//main

}
