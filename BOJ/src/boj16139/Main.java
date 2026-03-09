package boj16139;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int[][] sum = new int[(int)'z' + 1][str.length()+1];
		//처음 코드
//		for(int i='a' ; i<='z' ; i++) {
//			sum[i][0] = 0;
//			for(int j=1 ; j<=str.length() ; j++) {
//				if(str.charAt(j-1) == (char)i) {
//					sum[i][j] = sum[i][j-1] + 1;
//				}
//				else {	//값이 달라도 이전의 값은 가져와야함
//					sum[i][j] = sum[i][j-1];
//				}
//			}
//		}
		//개선된 코드
		for(int i=1 ; i<=str.length() ; i++) {
			for(int j='a' ; j<='z' ; j++) {
				if(str.charAt(i-1) == j) {
					sum[j][i] = sum[j][i-1] +1;
				}else {
					sum[j][i] = sum[j][i-1];
				}
			}
		}
		
		while(n-->0) {
			st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			char c = s.charAt(0);
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			sb.append(sum[c][end+1] - sum[c][start]).append("\n");				
			
		}
		
		System.out.println(sb);
		
	}//main

}
