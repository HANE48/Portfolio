package ex2_controlStatement;

/*
 	1 2 3
 	4 5 6
 	7 8 9
 */

public class Ex2_multiFor {

	
	public static void main(String[] args) {
		int k=1;
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j <6 ; j++) {
				System.out.printf("%02d ",k++);
				//System.out.printf("%d\t",k++);
			}
			System.out.println();
		}//for
		
		
	}//main

}
