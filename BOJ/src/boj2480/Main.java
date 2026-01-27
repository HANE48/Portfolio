package boj2480;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		if(a==b && b==c) {
			System.out.println(10000+a*1000);
		}
		else if(a==b || a==c || b==c) {
			if(a==b || a==c) {
				System.out.println(1000+a*100);
			}
			else {
				System.out.println(1000+b*100);
			}
		}
		else {
			int max = a;
			if(a<b || a<c) {
				max=b;
				if(max<c) {
					max=c;
				}
			}
			
			System.out.println(max*100);
		}
	}

}
