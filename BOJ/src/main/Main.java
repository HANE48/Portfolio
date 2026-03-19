package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		for(int i=0 ; i<str.length(); i++) {
			in:switch(str.charAt(i)) {
			case 'A': case 'b': case 'D': case 'd': case 'e': 
			case 'g': case 'O': case 'o': case 'P': case 'Q':
			case 'p': case 'q': case 'R': case '@': case '0':
			case '4': case '6': case '9': case 'a':
				count++;
				break in;
			case 'B': case '8':
				count += 2;
				break in;
			}//switch
		}
		
		System.out.println(count);
		
	}//main

}
