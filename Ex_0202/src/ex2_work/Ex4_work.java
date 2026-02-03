package ex2_work;

import java.util.Scanner;

/*
 * 주민번호(-포함)
 * 예)911122-1122333
 * >> 801009-2267890
 * 당신은 80년 10월 9일에 태어난 여자입니다.
 */

public class Ex4_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.charAt(6)!='-') {
			System.out.println("올바르게 입력해주세요 bbmmdd-1122333");
			System.exit(0);
		}
		int by = ((s.charAt(0) - '0')*10) + (s.charAt(1) - '0');
		int bm = ((s.charAt(2)-'0')*10) + (s.charAt(3)-'0');
		int bd = ((s.charAt(4)-'0')*10) + (s.charAt(5)-'0');
		int mf = (s.charAt(7) - '0');
		
		if(mf == 1 || mf ==3) {
			System.out.printf("당신은 %d년 %d월 %d일에 태어난 남자입니다", by, bm, bd);
		}else{
			System.out.printf("당신은 %d년 %d월 %d일에 태어난 여자입니다", by, bm, bd);
		}
		
		sc.close();
		
		
	}//main

}
