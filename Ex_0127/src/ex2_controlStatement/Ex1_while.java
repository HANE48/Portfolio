package ex2_controlStatement;

public class Ex1_while {

	public static void main(String[] args) {
		//while문: 간편한 구성을 가진 반복문
		//선 비교 후 처리
		//while( 조건식 ){
		//	조건식이 참인경우 실행되는 영역
		//}
		
		int num = 1;
		while( num < 5 ) {
			
			System.out.println(num);
			num++;
			
		}//while
		
		System.out.println("=====================");
		//10~1까지 감소하며 while문으로 출력
		
		num = 11;
		while(num --> 1) {
			System.out.println(num);
		}
		
	}//main

}
