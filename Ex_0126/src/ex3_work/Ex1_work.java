package ex3_work;

/*	홀수 라인에만 *을 출력하는 2중 for문 작성
 	* * * * *
 	1 2 3 4 5
 	* * * * *
 	1 2 3 4 5
 	* * * * *
 */

public class Ex1_work {

	public static void main(String[] args) {
		for(int i=0 ; i<5 ; i++) {
			for(int j=1 ; j<6 ; j++) {
				if(i%2 == 0) {
					System.out.print("* ");
				}
				else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}//main

}
