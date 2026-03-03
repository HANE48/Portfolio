package boj25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int call = 0;
	public static int recursion(String s, int l, int r){
        if(l >= r) {
        	call++;
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	call++;
        	return 0;        	
        }
        else {
        	call++;
        	return recursion(s, l+1, r-1);
        }
    }
	
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(n-->0) {
			String str = br.readLine();
			sb.append(isPalindrome(str)).append(" ").append(call).append("\n");
			call = 0;
		}
		
		System.out.println(sb);
	}//main

}
