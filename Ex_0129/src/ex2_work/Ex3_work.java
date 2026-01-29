package ex2_work;

import java.util.Scanner;

/*
 * 학생들의 수학, 영어 성적을 입력하는 프로그램 만들기
 * ---------------------------------
 * 등록 인원: 2
 * 이름: hong
 * 수학 성적: 90
 * 영어 성적: 87
 * -------------
 * 이름: park
 * 수학 점수: 70
 * 영어 점수: 99
 * -------------
 * 2명 등록완료
 * hong 90 87
 * park 70 99
 * 
 */

public class Ex3_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록 인원: ");
		int n = sc.nextInt();
		
		String[] s = {"수학", "영어"};
		String[][] arr = new String[n][3];
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print("이름: ");
			arr[i][0] = sc.next();
			
			for(int j=1 ; j<arr[i].length ; j++) {
				System.out.print(s[j-1] + " 점수: ");
				arr[i][j] = sc.next();
			}//inner
			System.out.println("-------------");
		}//outer
		
		System.out.println(n + "명 등록완료");
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}//main

}
