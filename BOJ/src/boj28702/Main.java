package boj28702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * FizzBuzz 문제는 
 * i = 1, 2, \cdots$ 에 대해 다음 규칙에 따라 문자열을 한 줄에 하나씩 출력하는 문제입니다.
 * i가 
 * 3의 배수이면서 5의 배수이면 “FizzBuzz”를 출력합니다
 * i가 3의 배수이지만 5의 배수가 아니면 “Fizz”를 출력합니다.
 * i가 3의 배수가 아니지만 5의 배수이면 “Buzz”를 출력합니다.
 * i가 3$의 배수도 아니고 5의 배수도 아닌 경우 i를 그대로 출력합니다.
 * FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 주어집니다. 
 * 이때, 이 세 문자열 다음에 올 문자열은 무엇일까요?
 */



public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = new String[3];
		int[] num = new int[3];
		int ans;
		String res = "";
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = br.readLine();
			try {
				num[i] = Integer.parseInt(arr[i]);
			}catch(NumberFormatException e) {
				num[i] = -1;
				continue;
			}
		}
		
		if(num[0] == -1) {
			if(num[1]==-1) {
				num[0] = num[2]-2;
			}else {
				num[0] = num[1]-1;
			}
		}
		
		
		for(int i=1 ; i < num.length ; i++) {
			if(num[i] == -1) {
				num[i] = num[0] + i;
			}
		}//for
		
		ans = num[2] + 1;
		if((ans % 3 == 0) || (ans % 5 == 0) || (ans % 15 == 0)){
			if(ans % 3 == 0 && ans % 5 ==0) {
				ans = -1;
				res = "FizzBuzz";
			}else if(ans % 5 == 0) {
				ans = -1;
				res = "Buzz";
			}else {
				ans = -1;
				res = "Fizz";
			}
		}
		
		if(ans == -1) {
			bw.write(res);
		}else {
			bw.write(Integer.toString(ans));
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}//main

}
