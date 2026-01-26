package ex5_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*	2진법
 	04, 05, 06, 07, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30
 	16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 ,30
 	01, 03, 05, 07, 09, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29
 	08, 09, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30
 	02, 03, 06, 07, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30
 */


public class Ex2_work {

	public static void main(String[] args) throws IOException{
		int n1, sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자 하나(1~30)를 머리속으로 생각하고 숫자가 나왔을 때 그 숫자가 있으면 1을 없으면 0을 입력해 주십시오.");
		System.out.println("04, 05, 06, 07, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30");
		n1 = Integer.parseInt(br.readLine());
		if(n1 == 1 || n1 == 0) {
			sum += 4*n1;			
		}
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 ,30");
		n1 = Integer.parseInt(br.readLine());
		if(n1 == 1 || n1 == 0) {
			sum += 16*n1;			
		}else {
			System.out.println("올바른 값을 입력해주세요....!!");
		}
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("01, 03, 05, 07, 09, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29");
		n1 = Integer.parseInt(br.readLine());
		if(n1 == 1 || n1 == 0) {
			sum += 1*n1;			
		}else {
			System.out.println("올바른 값을 입력해주세요....!!");
		}
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("08, 09, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30");
		n1 = Integer.parseInt(br.readLine());
		if(n1 == 1 || n1 == 0) {
			sum += 8*n1;			
		}else {
			System.out.println("올바른 값을 입력해주세요....!!");
		}
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("02, 03, 06, 07, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30");
		n1 = Integer.parseInt(br.readLine());
		if(n1 == 1 || n1 == 0) {
			sum += 2*n1;			
		}else {
			System.out.println("올바른 값을 입력해주세요....!!");
		}
		System.out.println("-----------------------------------------------------------");
		
		if(sum > 30) {
			System.out.println("1~30 내로만 생각하주세요!");
		}else {
			System.out.printf("당신이 생각한 숫자는 %d입니다.", sum);
		}
		
		br.close();
		
	}//main

}
