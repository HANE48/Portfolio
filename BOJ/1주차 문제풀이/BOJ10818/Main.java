package BOJ10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n, arr[], min=99999999, max=-99999999;
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		bw.write(min + " " + max);			
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
