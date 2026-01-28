package ex2_label;

/*
 * 
 */

public class Ex2_label {

	public static void main(String[] args) {
		
		out : for(int i = 1 ; i <= 2 ; i++) {
			
			for(int j = 1 ; j <= 4 ; j++) {
				
				if( j % 2 == 0 ) {
					continue out;				//for문은 증감식으로 감 증감식이 없으면 조건문으로 감
				}
				System.out.print(j + " ");
				 
			}//inner
			System.out.println();
		}//outer
		
	}//main

}
