package boj1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		int n;
		float[] arr, narr;
		float sum=0, max=-2147483647, avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		arr = new float[n];
		narr = new float[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Float.parseFloat(st.nextToken());
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			narr[i] = (arr[i]/max) * 100f;
			sum += narr[i];
		}
		
		avg = sum/n;
		
		
		bw.write(Float.toString(avg));
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
