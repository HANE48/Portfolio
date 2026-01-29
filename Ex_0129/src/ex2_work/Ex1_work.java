package ex2_work;


/*
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 */

public class Ex1_work {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		int k=1;
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = k++;
			}//inner
		}//outer
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.printf("%02d ",arr[i][j]);
			}//inner
			System.out.println();
		}//outer
		
		
		
	}

}
