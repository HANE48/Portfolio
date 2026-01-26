package Ex1_controlStatement;

public class Ex1_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문
		//프로그램의 흐름을 제어하는 문장
		//분기문과 반복문으로 나뉜다
		//1)분기문: if, switch
		//2)반복문: for, while
		
		//단순 if문
		//if(조건식){
		//	조건식이 참일경우 실행되는 영역
		//}
		
		int n = 51;
		//String 타입은 ""안에 여러 글자를 저장하는 자료형
		String str = "안녕하세요.";
		if(n == 50) {
			str="n is 50.";
		}
		if(n != 50) {
			str="n is't 50";
		}
		
		System.out.println(str);
			
		
	}//main

}
