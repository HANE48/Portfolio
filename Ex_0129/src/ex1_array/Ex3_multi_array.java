package ex1_array;

public class Ex3_multi_array {

	public static void main(String[] args) {
		
		char[][] alpha = {{ 'A', 'B' }, { 'C', 'D', 'E' }, { 'F' } };
		
		for(int i=0 ; i<alpha.length ; i++) {
			for(int j=0 ; j<alpha[i].length ; j++) {
				System.out.print(alpha[i][j] + " ");
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("------------------");
		
		char[][] arr = new char[3][];
		
		arr[0] = new char[2];
		arr[1] = new char[3];
		arr[2] = new char[1];
		
		arr[0][0] = 'A';
		arr[0][1] = 'B';
		
		arr[1][0] = 'C';
		arr[1][1] = 'D';
		arr[1][2] = 'E';
		
		arr[2][0] = 'F';
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}//inner
			System.out.println();
		}//outer
		
		
	}//main

}
