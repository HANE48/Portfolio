package ex2_work;

import java.util.Scanner;

/*
 * 회문 판정하기
 * 앞에서 읽으나 뒤에서 읽으나 똑같은 수 또는 문자열
 * 키보드로 값을 받음
 * ----------------------------------
 * a121a
 * a121a는 회문입니다
 * 
 * abc1
 * abc1은 회문이 아닙니다.
 */

public class Ex1_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt=0;
		
		for(int i=0 ; i<str.length()/2 ; i++) {
			for(int j = str.length()-1 ; j>i ; j--) {
				if(str.charAt(i) == str.charAt(j)) {
					cnt++;
					break;
				}
			}
		}
		
		if(cnt == str.length()/2) {
			System.out.println(str + "은(는) 회문입니다.");
		}else {
			System.out.println(str + "은(는) 회문이 아닙니다.");
		}
		sc.close();
		
	}//main

}
