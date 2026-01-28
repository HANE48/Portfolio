package ex3_array;

/*
 * 
 */

public class Ex2_singleArray {

	public static void main(String[] args) {
		
		char[] ch;
		ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//ch에 닶긴 모든 값 출력하기
		for(int i=0 ; i<ch.length ; i++ ) {
			System.out.print(ch[i]);
		}
		
		
	}//main

}
