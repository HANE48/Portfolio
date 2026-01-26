package ex3_work;



public class Ex2_work {

	public static void main(String[] args) {
		//2 X 1 = 2		3 X 1 = 3 ..... 9 X 1 = 9
		//  ...
		//2 X 9 = 18 ....				9 X 9 = 81
		for(int i=2 ; i< 10 ; i++) {
			for(int j=1 ; j<10 ; j++) {
				System.out.printf("%d * %d = %d\t", i,j,i*j);
			}
			System.out.println();
		}
		
	}//main

}
