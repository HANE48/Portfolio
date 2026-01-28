package ex3_array;

/*
 * 배열: 같은 자료형끼리 모아두는 묶음
 * 효율적인 자료관리를 위해 반드시 필요
 * 
 * 배열을 만드는 단계
 * 1)배열의 선언
 * 2)배열의 생성
 * 3)배열의 초기화
 * 
 * 배열은 초기화 하지않으면 기본으로 0을 채움
 */

public class Ex1_singleArray {

	public static void main(String[] args) {
		
//		int n1 = 100;
//		int n2 = 97;
//		int n3 = 67;
//		int n4 = 55;
		
		int[] arr;			//1)
		
		arr = new int[4];	//2)
		
		arr[0] = 100;		//3)
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
//		arr[4] = 500;		없는 인덱스에 접근하지 않도록 조심!!
		
		
//		for(int i=0 ; i<4 ; i++) {
//			arr[i] = 100 * (i+1);
//		}
		
		for(int i=0 ; i<arr.length ; i++) {		//배열에 담긴 모든 값 출력하기
			System.out.println(arr[i]);
		}
	}//main
	
}
