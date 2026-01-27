package boj3003;

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
		
		int inp[] = new int[6];
		int ans[] = {1,1,2,2,2,8};
		
		for(int i=0 ; i<6 ; i++) {
			inp[i] = Integer.parseInt(st.nextToken());
		}//for
		
		for(int i=0 ; i<6 ; i++) {
			if(inp[i] == ans[i]) {
				inp[i] = 0;
			}else if(inp[i] < ans[i]) {
				if(inp[i]==0) {
					inp[i] = ans[i];
				}else {
					inp[i] = ans[i] - inp[i];
				}
			}else if(ans[i] < inp[i]) {
				inp[i] = ans[i] - inp[i];
			}//if
		}//for
		
		for(int i=0 ; i<6 ; i++) {
			bw.write(Integer.toString(inp[i]) + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
