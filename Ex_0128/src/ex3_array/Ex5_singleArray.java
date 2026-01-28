package ex3_array;

public class Ex5_singleArray {

	public static void main(String[] args) {
		//배열 arr에 담긴 모든 값의 합을 출력
		//결과: 150
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0, i=arr.length;
		
		while(--i >= 0) {
			sum += arr[i];
		}
		System.out.println("결과: " + sum);
		
	}//main

}
