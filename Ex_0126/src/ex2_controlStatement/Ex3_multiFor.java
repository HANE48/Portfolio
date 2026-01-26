package ex2_controlStatement;

/*
 * A B C D
 * E F G H
 * I J K L
 */

public class Ex3_multiFor {

	public static void main(String[] args) {
		char c = 'A';
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<4 ; j++ ) {
				System.out.print(c++ + " ");
			}//inner
			System.out.println();
		}//outer
	}//main

}