package boj2941;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


//z= s= nj lj d- c- c=


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = br.readLine();
		
		for(String s : croatian) {
			str = str.replace(s,"*");
		}
		
		bw.write(Integer.toString(str.length()));
		bw.flush();
		bw.close();
		br.close();
		
	}//main

}
