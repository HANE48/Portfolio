package ex3_break;

public class Ex2_break {

	public static void main(String[] args) {
		int n = 1;
		
		while( true ) {
			
			System.out.println(n++);
			
			if(n > 5) {
				break;
			}//if
			
		}//while
		System.out.println("-----------------------------");
		//1부터 10까지 반복하는 for문에서 5보다 큰 첫번째 수를 찾아 출력 후 for문을 종료
		//--------------------------------
		//결과 6
		
		for(int i=1 ; i<11 ; i++) {
			if(i>5) {
				System.out.println(i);
				break;
			}
		}//for
		
		int j=1;
		while(j++<10) {
			if(j>5) {
				System.out.println(j);
				break;
			}
		}//while
	}//main

}
