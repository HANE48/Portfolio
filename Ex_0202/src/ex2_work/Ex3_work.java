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
		int i = 0;					//y축
		int j = arr.length/2;		//x축
		
		while(true) {
			if(cnt == n*n+1) {
				break;
			}
			
			arr[i][j] = cnt++;
			
			int ci = i;				//바꾸기 전 값을 저장
			int cj = j;				//바꾸기 전 값을 저장
			int chi = 0;			//바뀐 여부를 저장
			int chj = 0;			//바뀐 여부를 저장
			
//			if((cnt-1) % arr.length == 0) {		//개선코드 -- 이동하려는 자리에 값이 있을경우 
//				i++;
//			}else {
//				j++;	
//				i--;
//			}
			
			j++;					//x축 증가
			i--;					//y축 증가
			
			if(i<0) {				//y축이 올라갈 곳이 없는경우
				i=arr.length-1;
				chi++;
			}
			if(j>=arr.length) {		//x축이 오른쪽으로 갈 곳이 없는경우
				j=0;
				chj++;
			}
			if(arr[i][j] != 0) {	//이미 값이 있는경우
				i+=2;
				j--;
				if(chi != 0) {		//값이 바뀌었는지 확인 바뀌었으면 기존값의 밑으로 이동
					i = ci+1;
				}
				if(chj != 0) {		//값이 바뀌었는지 확인 바뀌었으면 기존값으로 이동
					j = cj;
				}
				if(i<0) {			//y축이 내겨갈 곳이 없는경우
					i=arr.length-1;
				}
				if(j<0) {			//x값을 기존값으로 되졸렸지만 갈 곳이 없는경우 오른쪽 맨 끝으로 이동
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
