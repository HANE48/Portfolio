package boj18301;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n12, n;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n12 = sc.nextInt();
		
		n = (((n1 +1) * (n2 +1))/(n12 +1)-1);
		System.out.print(n);
		sc.close();
	}//main

}
