package ex2_work;

import java.util.Random;
import java.util.Scanner;

/*
 * 숫자야구를 배열로 만들기
 */

public class Ex5_work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[3];
		outer: for(int i=0 ; i<c.length ; ) {
			c[i] = new Random().nextInt(9)+1;
			
			for(int j=0 ; j<i ; j++) {
				if(c[i] == c[j]) {
					continue outer;
				}
			}
			i++;
		}//for
		
		System.out.println("정답: " + c[0] + c[1] + c[2]);
		
		
		while(true) {
			System.out.println("값: ");
			int num = sc.nextInt();
			int[] u = {num/100, (num/10)%10, num%10};
			int s=0;
			int b=0;
			
			for(int i=0 ; i<c.length ; i++) {
				for(int j=0 ; j<u.length ; j++) {
					if(c[i] == u[j] && i==j) {
						s++;
					}else {
						b++;
					}
				}//inner
			}//outer
			
			if(s==3) {
				System.out.println("정답!!");
				break;
			}
			
			if(s==0 && b==0) {
				System.out.println("OUT!!");
				continue;
			}
			System.out.println(s + " Strike/" + b + " Ball");
		}//while
		
		sc.close();
	}//main

}
