package boj14626;


/*
 * ISBN이 abcdefghijklm 일 때, a+3b+c+3d+e+3f+g+3h+i+3j+k+3l+m ≡ 0 (mod 10)
 * 즉, 체크기호 m = 10 - (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) mod 10 이다.
 * 단, 10으로 나눈 나머지 값이 0일 경우 체크기호는 0이다.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int check = 0;
		int num = 0;
		
		for(int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			if(ch != '*') {
				num += i%2==0 ? ch - '0' : (ch-'0')*3;
			}
			else {
				check = i;
			}
		}
		
		int answer = 0;
		while(true) {
			if(check%2==0) {
				if((num+answer) % 10 == 0) {
					bw.write(Integer.toString(answer));
					break;
				}
			}
			else {
				if((num + answer * 3 )%10 == 0){
					bw.write(Integer.toString(answer));
					break;
				}
			}
			answer++;
		}//while
		
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
