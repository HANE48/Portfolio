package ex1_work;

import java.util.Scanner;

//키보드에서 숫자 두개를 입력받아 최대 공약수 구하기
//12 18
//6

public class Ex1_work {

	public static int gcd(int n1, int n2) {
		if(n1%n2==0) {
			return n2;
		}
		else {
			return gcd(n2, n1%n2);
		}
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n1, n2, gcd=0;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;	
		}
		
		//System.out.printf("GCD is %d\n", gcd(n1,n2));
		
		while(true) {
			if(n1 % n2 == 0 ) {
				if(n2 == 1) {
					System.out.println("GCD is not exist");
					break;
				}
				System.out.printf("GCD is %d", gcd);
				break;
			}else {
				gcd = n1 % n2;
				n1 = n2;
				n2 = gcd;
			}
		}
		
		int i=0;
		for(i=n1 ; i>=1 ; i--) {
			if(n1 % i == 0 && n2 % i == 0) {
				break;
			}
		}
		
		if(i==1) {
			System.out.println("GCD is not exist");
		}else {
			System.out.printf("\nGCD is %d", i);
		}
	
		sc.close();
		
	}//main

}
