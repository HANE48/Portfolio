package ex6_work;

import java.util.Scanner;

/*
 * 홀수 마방진 
 * 잴 위에서 가운데 1
 * 그리고 오른쪽으로 한칸 위로 한칸가서
 * 그 다음값을 넣는다
 * 그 칸에 값이 있으면 원래있던 칸에서 한칸 밑에 넣는다
 */

public class SquareMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrintSquare ps = new PrintSquare(n);
		ps.print();
		sc.close();
		
	}//main

}
