package ex1_work;


/*
 * 배열의 담긴 모든 값의 합과 평균
 */

public class Ex12_work {

	public static void main(String[] args) {
		int[] arr = {15, 7, 20, 13, 9};
		int sum = 0;
		double avg = 0;
		
		for(int i: arr) {
			sum += i;
		}
		
		avg = (double)sum/arr.length;
		
		System.out.println("모든 값의 합: " + sum + "\n평균: " + avg);
		
	}//main

}
