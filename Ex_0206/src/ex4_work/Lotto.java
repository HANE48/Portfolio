package ex4_work;

import java.util.Random;

public class Lotto {
	
	private int[] arr = new int[6];
	public Lotto() {
		out: for(int i=0 ; i<arr.length ; ) {
			arr[i] = new Random().nextInt(45)+1;
//			for(int j=0 ; j<arr.length ; j++) {		//내가 만든 코드
//				if(arr[i] == arr[j] && i != j) {
//					i=0;
//					continue out;
//				}
//			}
			
			//개선된 코드
			for(int j=0 ; j<i ; j++) {		//j를 i까지만 비교하면 같은 인덱스의 값 비교 방지	
				if(arr[i] == arr[j]) {			
					continue out;			//값이 같으면 i를 증가하지 않고 다시 난수를 생성함
				}
			}
			
			i++;							//값이 다르면 i를 증가시켜 다음 배열에 난수 생성
		}
	}
	
	public int[] getArr() {
		return arr;
	}
	
	
}
