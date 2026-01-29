package ex4_work;

/*
 * 배열 arr의 담긴 모든 값의 합과 평균을 출력
 */


public class Ex5_work {

	public static void main(String[] args) {
		
		int[] arr = {15, 7, 20, 13, 9};
		int sum = 0;
		double avg;
		
		for(int i: arr) {
			sum += i;
		}
		avg = (double)sum / arr.length;
		
		System.out.println("배열의 모든 값의 합: " + sum + "\n배열의 모든 값의 평균: " + avg );
		
		
	}//main

}
