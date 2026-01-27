package ex4_continue;

/*
 * while문 내부의 continue를 만나면
 * 조건식으로 건너뛴다
 */

public class Ex2_continue {

	public static void main(String[] args) {
		int num =1;
		while( num< 5 ) {
			System.out.println("i값: "+ num);
			
			switch(num++) {
			case 2:
				System.out.println("i'm 2");
				continue;		
			}//switch
			
		}//while
		
		System.out.println("--------------------");
		
		int n = 0;
		while( n++ < 5 ) {
			
			if( n % 2 == 0 ) {
				continue;
			}
			
			System.out.println(n);
			
		}//while
		
	}//main

}
