package ex4_work;

/*
 * 1에서 45사이의 중복되지 않는 난수 6개 만들기
 */

public class LottoMain {

	public static void main(String[] args) {
		Lotto l = new Lotto();
		int[] lotto = l.getArr();
		
		for(int i: lotto) {
			System.out.print(i + " ");
		}
		
		
		
	}//main

}
