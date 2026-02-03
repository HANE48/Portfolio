package boj24266;


/*  MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
	}
	이 코드의 시간복잡도 및 최고차항의 계수 출력

*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n*n*n);
		System.out.println("3");
		sc.close();
		
	}

}
