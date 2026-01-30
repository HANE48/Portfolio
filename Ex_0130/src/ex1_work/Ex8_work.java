package ex1_work;

/*
 * 2단부터 9단까지 구구단 출력
 */

public class Ex8_work {

	public static void main(String[] args) {
		
		for(int i=2 ; i<10 ; i++) {
			for(int j=1 ; j<10 ; j++) {
				System.out.print(i + " X " + j + " = " + (i*j) + " \t");
			}
			System.out.println();
		}
		
	}//main

}
