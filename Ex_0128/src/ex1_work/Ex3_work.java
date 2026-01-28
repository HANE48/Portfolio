package ex1_work;

/*
 * 두 개의 주사위를 던졌을 때 
 * 눈금의 합이 5,6,7이 되는 경우의 수를 찾아 출력
 * ---------------------------------
 * 5:1 4 2 3 3 2 4 1
 * 6:1 5 2 4 3 3 4 2 5 1
 * 7: 1 6 2 5 3 4 4 3 5 2 6 1
 *
 *
 *
 *
 *
 *
 */

public class Ex3_work {

	public static void main(String[] args) {
		
//		String five = "";
//		String six = "";
//		String seven = "";
		
		int cnt = 5;
		for (int k = 1; k <= 3; k++) {

			System.out.printf("%d : ", cnt);
			for (int i = 1; i <= 6; i++) {

				for (int j = 1; j <= 6; j++) {
					if (i + j == cnt) {
						System.out.printf("%d %d  ", i, j);
					}
				}
			}
			System.out.println();
			cnt++;

		}
		
//		System.out.println("5: " + five);
//		System.out.println("6: " + six);
//		System.out.println("7: " + seven);
		
	}//main

}
