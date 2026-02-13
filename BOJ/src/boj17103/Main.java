package boj17103;

import java.io.*;

public class Main {
	public static boolean[] primeArray = new boolean[1000001];

	public static void findPrime() {
		primeArray[0] = true;
		primeArray[1] = true;
		
		for(int i=2 ; i< primeArray.length ; i++) {
			if(primeArray[i] == false) {
				for(int j=2 ; i*j < primeArray.length ; j++) {
					primeArray[i*j] = true;
				}
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		findPrime();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			int m = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			if(m%2 == 0 && m!=0) {
				for(int j=2 ; j<=m/2 ; j++) {
					if(!primeArray[j]) {
						if(!primeArray[m-j]) {
							cnt++;
						}
					}
				}
				bw.write(Integer.toString(cnt) + "\n");
			}else {
				bw.write("0\n");
			}
			
		}//for
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main

}
