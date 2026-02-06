package ex5_work;

import java.util.Scanner;

/*
 * pallindrome
 */

public class Workmain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
//		int cnt=0;
//		for(int i=0 ; i<str.length()/2 ; i++) {			//내가 만든 코드
//			for(int j=str.length()-1 ; j>i ; j--) {
//				if(str.charAt(i) == str.charAt(j)) {
//					cnt++;
//					i++;
//				}
//			}
//		}
//		
//		if(cnt==str.length()/2) {
//			System.out.println(str + "(은)는 회문입니다.");			
//		}else{
//			System.out.println(str + "(은)는 회문이 아닙니다.");			
//		}
//		
		
		Work w = new Work();
		if(w.reverse(str)) {			//클래스를 나눠서 만들 경우
			System.out.println(str + "(은)는 회문입니다. ");
		}else {
			System.out.println(str + "(은)는 회문이 아닙니다.");			
			
		}
		
		
		sc.close();

	}//main

}
