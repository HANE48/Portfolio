package boj25314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();

		while (true) {
			if(n>=4) {
				System.out.print("long ");
				n -=4;
			}
			else {
				break;		
			}
		}
		System.out.println("int");

	}

}
