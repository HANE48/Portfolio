package ex1_contorlStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2_single_for {

	public static void main(String[] args) throws IOException{
		/*
		 	은행 이자 계산하기
		 	은행 이자가 1일에 1원씩 추가됨
		 	원금과 예치일수를 키보드에서 받고 예치일이 끝났을 때 나의 원금이 얼마가 되었을지를 출력
		 	입력: 1000 5
		 	5일 후의 잔액은 1005원 입니다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int money, day;
		money = Integer.parseInt(st.nextToken());
		day = Integer.parseInt(st.nextToken());
		for(int i=0 ; i<day ; i++) {
			money += 1;
		}
		System.out.printf("%d일후 잔액은 %d원 입니다.", day, money);
		br.close();
		
	}//main

}
