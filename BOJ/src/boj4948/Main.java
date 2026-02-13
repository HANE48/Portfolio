package boj4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			int[] arr = new int[2*n+1];
			
			if(n==0) {
				break;
			}
			
			if(n==1) {
				bw.write("1\n");
				continue;
			}
			
			for(long i=2 ; i<arr.length ; i++) {
				arr[(int)i] = (int)i;
			}
			
			for(long i=2 ; i<arr.length ; i++) {
				if(arr[(int)i] == 0) {
					continue;
				}
				
				for(long j= i*i ; j<arr.length ; j+=i) {
					arr[(int)j]=0;
				}
			}
			
			for(int i=n+1 ; i<arr.length ; i++) {
				if(arr[i]==0) {
					continue;
				}
				cnt++;
			}

			bw.write(Integer.toString(cnt) + "\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main
}
