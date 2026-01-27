package boj10988;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inp = br.readLine();
		int count=0;
		if(inp.length()%2==0) {
			for(int i=0 ; i<inp.length()/2 ; i++) {
				if(inp.charAt(i) == inp.charAt(inp.length()-i-1)){
					count++;
				}
			}
		}else {
			for(int i=0 ; i<inp.length()/2 ; i++) {
				if(inp.charAt(i) == inp.charAt(inp.length()-i-1)) {
					count++;
				}
			}
		}
		
		if(count == inp.length()/2) {
			bw.write("1");
		}
		else {
			bw.write("0");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
	}//main

}
