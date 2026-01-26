package ex1_contorlStatement;

import java.util.Scanner;

public class Ex3_single_for {

	public static void main(String[] args) {
		/*
		 	키보드에서 2~9사잇값을 입력받아 입력받은 숫자에 해당하는 구구단을 출력
		 	그 이외의 값은 '2~9사이의 값을 입력하세요'를 출력
		 	입력: 2
		 	출력 2 * 1 = 2
		 	   ....
		 	   2 * 9 = 18
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("알고싶은 구구단 단수를 입력해주세요:");
		int n = sc.nextInt();
		
		if(n<2 || n>9) {
			System.out.println("2~9사이의 값을 입력하세요");
		}else {
			for(int i=1 ; i<10 ; i++) {
				System.out.printf("%d * %d = %d\n", n, i, n*i);
			}			
		}
		
		
		sc.close();
	}//main

}
