package boj4134;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	
	public static boolean isPrime(long n) {
		for(int i=2 ; i<Math.sqrt(n)+1 ; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			long a = Long.parseLong(br.readLine());
			
			if(a==0 || a==1 || a==2) {
				bw.append("2\n");
				continue;
			}
			
			for(Long i = a ; ;i++) {
				if(isPrime(i)) {
					bw.append(Long.toString(i)+ "\n");
					break;
				}
			}
			
		}//while
		
		bw.flush();
		br.close();
		bw.close();
		
	}//main

}
