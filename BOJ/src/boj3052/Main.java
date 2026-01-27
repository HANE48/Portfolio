package boj3052;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num, numcp;
		int count = 0;
		num = new int[11];
		numcp = new int[1001];
		
		for(int i=0 ; i<10 ; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(numcp[num[i]%42] == 0) {
				count ++;
			}
			numcp[num[i]%42]++;
		}
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
