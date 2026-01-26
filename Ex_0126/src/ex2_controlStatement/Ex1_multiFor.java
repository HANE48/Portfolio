package ex2_controlStatement;

public class Ex1_multiFor {

	public static void main(String[] args) {
		//다중 for문: for문이 여러개
		//1 2
		//1 2
		for(int i=1 ; i <= 2; i++) {
			
			for(int j=1 ; j<=2 ; j++){
				
				System.out.print(j + " ");
				
			}//inner
			System.out.println();
		}//outer
		System.out.println("--------------------");
		for(int i=0 ; i<4 ; i++) {
			for(int j=1 ; j<5 ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}//for
		
		
		System.out.println("--------------------");
		//3 2 1
		//3 2 1
		//3 2 1
		for(int i=0 ; i<3 ; i++) {
			for(int j=3 ; j>0 ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}//main

}
