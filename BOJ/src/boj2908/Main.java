package boj2908;

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
		
		int n1, n2, arr[], k = 100;
		arr = new int[7];
		
		n1 = Integer.parseInt(st.nextToken());
		n2 = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<3 ; i++) {
			
			arr[i] = n1%10;
			n1 /= 10;
		}
		
		for(int i=3 ; i<6 ; i++) {
			
			arr[i] = n2%10;
			n2 /= 10;
		}
		
		for(int i=3 ; i<6 ; i++) {
			n2 += arr[i] * k;
			k /= 10;				
			
		}
		
		k=100;
		for(int i=0 ; i<3 ; i++) {
			n1 += arr[i] * k;
			k /= 10;				
			
		}
		
		
		if(n1<n2) {
			bw.write(Integer.toString(n2));
		}else {
			bw.write(Integer.toString(n1));
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
