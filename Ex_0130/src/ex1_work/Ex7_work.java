package ex1_work;

/*
 *1 2 3
 *4 5 6
 *7 8 9 
 */

public class Ex7_work {

	public static void main(String[] args) {
		int cnt =1;
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(cnt++ + " ");
			}
			System.out.println();
		}
		
		
	}//main

}
