package ex5_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 	윤년 계산하기
 	----------
 	년도를 입력하세요: 2000
 	2000년은 윤년입니다
 	
 	연도가 4로 나눠지지만 100으로는 나눠지지않으면 윤년 그러나, 100으로 나눠지도하도 400으로 나눠지면 윤년
 */

public class Ex3_work {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("연도를 입력하세오:");
		int year = Integer.parseInt(br.readLine());
		
		int ans=0;
		
		if(year % 4 ==0) {
			if(year % 100 > 0 ) {
				ans = 1;
			}
			else if(year % 400 == 0 ) {
				ans = 1;
			}
			
		}
		
		if(ans == 1) {
			System.out.printf("%d년은 윤년입니다", year);
		}
		else {
			System.out.printf("%d년은 윤년이 아닙니다", year);
		}
		br.close();
	}//main

}
