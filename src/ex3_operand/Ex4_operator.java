package ex3_operand;

public class Ex4_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감 연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//선행증감과 후행 증감의 차이만 구별할 수 있으면 된다.
		
		int s1 = 10;
		System.out.println(++s1);
		System.out.println(s1++);
		System.out.println(s1);
		
		int s2 = 10;
		System.out.println("s2: " + s2++);
		System.out.println(s2);
		
		System.out.println("----------------");
		
		//삼항 연산자
		//하나의 조건을 정의하고 그 조건이 참일때와 거짓일 때 원하는 타입의 결과를 얻기위한 연산자
		int a = 10;
		int b = 20;
		
		int result = ++a >= b ? a++ : ++b;	//?앞 조건이 참일경우 :앞의 조건을, 아니면 뒤의 조건을 가짐
		System.out.println(result);
		
		
	}//main

}
