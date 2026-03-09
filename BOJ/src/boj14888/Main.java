package boj14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int add;
	static int su;
	static int mul;
	static int div;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void operand(int sum, int index) {
		
		if(index == arr.length) {
			max = Math.max(sum, max);
			min = Math.min(sum, min);
			return ;
		}
		
		if(add > 0) {
			add--;
			operand(sum + arr[index], index+1);
			add++;
		}
		
		if(su > 0) {
			su--;
			operand(sum - arr[index], index+1);
			su++;
		}
		
		if(mul > 0) {
			mul--;
			operand(sum * arr[index], index+1);
			mul++;
		}
		
		if(div > 0) {
			div--;
			operand(sum/arr[index], index+1);
			div++;
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[n];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		add = Integer.parseInt(st.nextToken());		//더하기
		su = Integer.parseInt(st.nextToken());		//뺴기
		mul = Integer.parseInt(st.nextToken());		//곱하기
		div = Integer.parseInt(st.nextToken());		//나누기
		
		operand(arr[0], 1);
		System.out.println(max + "\n" + min);
		
	}

}
