package boj25304;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, num, a, b, abSum=0;
		
		Scanner sc = new Scanner(System.in);
		sum = sc.nextInt();
		num = sc.nextInt();
		
		for(int i=0 ; i< num ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			abSum += a*b;
		}
		sc.close();
		if(sum == abSum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
