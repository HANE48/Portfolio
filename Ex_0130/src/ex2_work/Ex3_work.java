package ex2_work;

import java.util.Random;
import java.util.Scanner;

/*
 * 1 ~ 9 사이의 난수 3개를 중복되지 않게 만들어서 
 * 가지고 있는 컴퓨터에 숫자를 맞히는 숫자 야구 게임
 * 
 * 
 */

public class Ex3_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];				//난수로 발생한 숫자 저장하는 배열
		int[] input;						//입력받은 값을 저장하는 배열
		int count = 20;
		

//		do {											//더 간단히 만든 코드
//			arr[0] = new Random().nextInt(9)+1;
//			arr[1] = new Random().nextInt(9)+1;
//			arr[2] = new Random().nextInt(9)+1;
//		}while(arr[0]==arr[1] || arr[1]==arr[2] || arr[0]==arr[2]);
		
		arr[0] = new Random().nextInt(9) + 1;			//내가 만든 코드
		for(int i=1 ; i<arr.length ; i++) {
			arr[i] = new Random().nextInt(9)+1;
			if(arr[i-1] == arr[i]) {
				while(true) {
					arr[i] = new Random().nextInt(9)+1;
					if(arr[i-1] != arr[i]) {
						i=0;
						break;
					}
				}//while
			}//if
		}//for
		
		for(int i: arr) {
			System.out.print(i);
		}
		System.out.println();
		
		
		while(true) {
			
			if(count == 0) {
				System.out.print("정답 기회 소진.... 정답은 ");
				for(int i: arr) {
					System.out.print(i);
				}
				break;
			}
			
			input = new int[3];
			int s = 0;			//strike
			int b = 0;			//ball
			
			for(int i=0 ; i<input.length ; i++ ) {
				System.out.print("숫자" + (i+1) + ": ");
				input[i] = sc.nextInt();
				for(int j=0 ; j<arr.length ; j++) {
					if(input[i] == arr[j]) {
						if(i==j) {
							s++;
						}
						else {
							b++;
						}
					}//if
				}//inner
			}//outer
			
			if(s==3) {
				System.out.print("정답!!!");
				break;
			}
			
			if(s==0 && b==0) {
				System.out.println("OUT!");
				System.out.println("남은 정답 기회: " + --count);
				System.out.println("------------------");
				continue;
			}
			
			System.out.println(s + " Strike," + b + " Ball");
			System.out.println("남은 정답 기회: " + --count);
			System.out.println("------------------");

		}//while
		
		sc.close();
		
	}//main

}
