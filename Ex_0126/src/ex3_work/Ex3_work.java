package ex3_work;

/*
 * 	별 찍기
 * 	        *
 * 	      * * * 
 * 	    * * * * * 
 * 	  * * * * * * * 
 * 	* * * * * * * * * 
 * 
 */

public class Ex3_work {

	public static void main(String[] args) {
		int star =1, space = 7;
		for(int i=0 ; i<4 ; i++) {
//			for(int j=0 ; j<space ; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0 ; j<star ; j++) {
//				System.out.print(" *");
//			}
			for(int j=0 ; j<(space + star) ; j++) {
				if(j<space) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
			space -= 2;
			star += 2;
		}
		System.out.println("==================");
		star = 1;
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<star ; j++) {
				System.out.print("* ");
			}
			System.out.println();
			star++;
		}
		
	}//main

}
