package ex3_array;

import java.util.Scanner;

public class Ex4_singleArray {

	public static void main(String[] args) {
		
		String[] ar = new String[2];		//String배열은 초기화 하지 않으면 자동으로 null로 초기화
		ar[0] = "뽀로로";
		ar[1] = "루피";
		
		
		//1. 뽀로로
		//2. 루피
		//키보드에서 값을 받음
		//>>1
		//뽀로로를 선택한 당신 뽀롱뽀롱 뽀로로
		//>>2
		//루피를 선택한 당신
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<ar.length ; i++) {
			System.out.printf("%d. %s\n", i+1, ar[i]);
		}
		System.out.print(">>");
		int n = sc.nextInt();
		
		System.out.printf("%s를 선택함", ar[n-1]);
		
		sc.close();
		
	}//main

}
