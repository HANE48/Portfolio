package boj10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = null;
		int search, sum=0;
		arr = new int[n];
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());			
		}
		
		search = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			if(arr[i] == search) {
				sum++;
			}
		}
		System.out.println(sum);
		br.close();
		
	}

}
