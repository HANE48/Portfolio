package boj1193;

/*
 * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 
 * 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		int count = 0;
		int i = 1;
		int deno = 0;
		int number = 0;
		
		while(count < x) {
			count += i;
			i++;
		}
		
		if((i-1) % 2 == 0) {
			deno = 1 + (count - x);
			number = (i-1) - (count - x);
		}else {
			deno = (i-1) - (count-x);
			number = 1 + (count - x);
		}
		
		bw.write(Integer.toString(number) +  "/" + deno);
		bw.flush();
		br.close();
		bw.close();
	}//main

}
