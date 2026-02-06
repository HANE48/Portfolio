package ex5_work;

import java.util.Scanner;

/*
 * StringBuffer를 이용한 회문 판별법
 */

public class WorkMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		String ori = sc.next();
		
		StringBuffer sb = new StringBuffer(ori);
		String rev = sb.reverse().toString();
		
		if(ori.equals(rev)) {
			System.out.println(ori + "(은)는 회문입니다. ");
		}else {
			System.out.println(ori + "(은)는 회문이 아닙니다.");			
			
		}
		sc.close();
	}//main

}
