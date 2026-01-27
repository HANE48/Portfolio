package boj2525;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h, m, l;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		sc.close();
		
		if(m + l >= 60) {
			h = ((m+l)/60)+h;
			if(h >= 24) {
				h %= 24;
			}
			m = (m+l) % 60;
			System.out.println(h + " " + m);
		}
		else {
			System.out.println(h + " " + (m+l));
		}
		
	}//main

}
