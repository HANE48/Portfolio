package boj2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		int starCount, spaceCount, n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		spaceCount = n-1;
		starCount = 1;
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<spaceCount ; j++) {
				System.out.print(" ");
			}//inner
			
			for(int j=0 ; j<starCount ; j++) {
				System.out.print("*");
			}//inner
			starCount += 2;
			spaceCount -= 1;
			System.out.println();
		}//outer
		
		starCount = 2*n-3;
		spaceCount = 1;
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<spaceCount ; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<starCount ; j++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCount +=1;
			starCount -=2;
		}//for
		br.close();
	}//main

}//Main
