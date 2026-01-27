package boj27866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		int n;
		char answer;
		input = br.readLine();
		n = Integer.parseInt(br.readLine()) - 1;	
		answer = input.charAt(n);
		
		bw.write(answer);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
