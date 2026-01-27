package BOJ10813;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "), ar;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, m, arr[];
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0 ; i<m ; i++) {
			int j, k, temp;
			ar = new StringTokenizer(br.readLine());
			j = Integer.parseInt(ar.nextToken());
			k = Integer.parseInt(ar.nextToken());
			
			if(j==k) {
				continue;
			}
			
			temp = arr[j-1];
			arr[j-1] = arr[k-1];
			arr[k-1] = temp;
		}
		
		for(int i=0 ; i<n ; i++) {
			bw.write(Integer.toString(arr[i]) + " ");
		}
		bw.flush();
		br.close();
		bw.close();
		
	}

}
