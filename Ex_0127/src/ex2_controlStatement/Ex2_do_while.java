package ex2_controlStatement;

public class Ex2_do_while {

	public static void main(String[] args) {
		/*
		 * do_while문: 선처리, 후비교
		 * do{
		 * 	실행할 문장
		 * }
		 * while(조건문);
		 * 
		 */
		int i = 5;
		do {
			System.out.println(i++);
		}while(i <= 10);
		
		System.out.println("------------------");
		
		i = 11;
		
		do {
			System.out.println(i);
		}while(i++<=10);
		
	}//main

}
