package boj14681;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}
		else if(x<0 && y>0) {
			System.out.println("2");
		}
		else if(x<0 && y<0) {
			System.out.println("3");
		}
		else if(x>0 && y<0) {
			System.out.println("4");
		}
		
	}

}
