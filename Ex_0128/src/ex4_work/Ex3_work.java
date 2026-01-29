package ex4_work;


/*
 * arr = {4, 13, 7, 19, 1, 15}
 * 배열 arr의 담긴 값중 가장 큰 값을 출력
 */


public class Ex3_work {

	public static void main(String[] args) {
		
		int[] arr = {4, 13, 7, 19, 1, 15};
		int max = -2147483647;
		
		for(int i: arr) {
			if(max<i) {
				max = i;
			}
		}
		
		System.out.println(max);
		
		//배열 arr의 값을 오름차순으로 출력
		//----------------------
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
	}//main

}
