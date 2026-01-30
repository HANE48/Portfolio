package ex1_work;

/*
 * 배열 arr에 담긴 값중 가장 큰 값을 출력
 */

public class Ex11_work {

	public static void main(String[] args) {
		
		int[] arr = {4, 13, 7, 19, 1, 15};
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		//Arrays.sort(arr);
		
		System.out.println("max: " + arr[arr.length-1]);
		
		
	}//main

}
