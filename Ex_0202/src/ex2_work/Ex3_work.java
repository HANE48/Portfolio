package ex2_work;

import java.util.Scanner;

/*
 * 홀수 마방진 생성하기
 * 키보드에서 홀수를 입력받음
 * -------------
 * 값: 3
 * 08 01 06
 * 03 05 07
 * 04 09 02
 */

public class Ex3_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int cnt = 1;
		int i = 0;
		int j = arr.length/2;
		
		while(true) {
			if(cnt == n*n+1) {
				break;
			}
			arr[i][j] = cnt++;
			
			
			int ci = i;				//바꾸기 전 값을 저장
			int cj = j;				//바꾸기 전 값을 저장
			int chi = 0;
			int chj = 0;
			j++;	
			i--;
			if(i<0) {
				i=arr.length-1;
				chi++;
			}
			if(j>=arr.length) {
				j=0;
				chj++;
			}
			if(arr[i][j] != 0) {
				i+=2;
				j--;
				if(chi != 0) {
					i = ci+1;
				}
				if(chj != 0) {
					j = cj;
				}
				if(i<0) {
					i=arr.length-1;
				}
				if(j<0) {
					j=arr.length-1;
				}
			}//if
			
			
		}//while
		
		for(i=0 ; i<arr.length ; i++) {
			for(j=0 ; j<arr[i].length ; j++) {
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
		
	}//main

}
