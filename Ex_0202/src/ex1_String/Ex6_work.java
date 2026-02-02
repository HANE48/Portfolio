package ex1_String;

import java.util.Scanner;

/*
 * 키보드에서 값을 입력받아 숫자만으로 이루어져있는지 판단하기
 * -------------------------------------
 * 값: 123
 * 123은 숫자입니다
 * 값: 123aa
 * 123aa은(는)숫자가 아닙니다.
 */


public class Ex6_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int flag = 1;
		
		
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {				//대문자 A~Z사이일 경우
				flag--;
				break;
			}else if(str.charAt(i)>='a' && str.charAt(i) <='z'){		//소문자 a~z사이일 경
				flag--;
				break;
			}
			
		}//for
		
		if(flag  != 1) {
			System.out.println(str + "은(는) 숫자가 아닙니다.");
		}else {
			System.out.println(str + "은(는) 숫자입니다.");
		}
		sc.close();
		
	}//main

}
