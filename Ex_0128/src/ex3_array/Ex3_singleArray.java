package ex3_array;

/*
 * 배열의 선언, 생성, 초기화를 한번에!
 */

public class Ex3_singleArray {

	public static void main(String[] args) {
		
		String[] arr = new String[3];
		arr[0] = "김견우";
		arr[1] = "마자연";
		arr[2] = "김말숙";
		
		String[] sArr = { "김견우", "마자연", "김말숙" };
		
		for(int i=0 ; i<sArr.length ; i++) {
			System.out.print(sArr[i] + " ");
		}
		
		
	}//main

}
