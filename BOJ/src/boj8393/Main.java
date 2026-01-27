package boj8393;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		sc.close();
		
		for(int j=0; j<=i ; j++) {
			sum += j;
		}
		System.out.println(sum);
	}

}
