package boj10809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String arr, input;
		int narr[];
		arr = "abcdefghijklmnopqrstuvwxyz";
		input = br.readLine();
		narr = new int[arr.length()];
		
		for(int i=0 ; i<arr.length() ; i++) {
			
			for(int j=0 ; j<input.length() ; j++) {
				if(input.charAt(j) == arr.charAt(i)) {
					if(narr[i] == 0) {
						narr[i] = j;
					}
					break;
				}
				else if(j == input.length()-1) {
					narr[i] = -1;
				}
				
				
			}//for
		}//for
		
		for(int i=0 ; i<arr.length() ; i++) {
			bw.write(Integer.toString(narr[i]) + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
