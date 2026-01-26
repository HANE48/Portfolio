package ex3_operand;

public class Ex1_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		연산자
		1. 최고 연산자: . , ()
		2. 증감 연산자: ++, --
		3. 산술 연산자: +, -, *, /, %
		4. 시프트 연산자: <<, >>
		5. 비교 연산자: >, >=, ==, <=, <, !=
		6. 논리 연산자: &&, ||, !
		7. 삼항 연산자: ? :
		8. 비트 연산자: &, |, ^, ~
		9. 대입 연산자: =, *=, /=, &=, +=, -= 
		*/
		
		//1. 산술연산자
		//4칙연산과 나머지연산자
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println(n3 + " " +(n1+n2));
		
		n3 = n1 * n2;
		System.out.println(n3 + " " +(n1*n2));
		
		n3 = n1 / n2;
		System.out.println(n3 + " " +(n1/n2));
		
		n3 = n1 % n2;		//나누기를 한 나머지를 가지고 옴
		System.out.println(n3 + " " +(n1%n2));
		System.out.println("-----------------------");
		
		//대입연산자
		//특정 값을 변수에 전달하여 기억시키는 연산자
		int a1 = 10;
		int a2 = 7;
		a1 += a2;
		System.out.println(a1);
		
		a1 -= 3;
		System.out.println(a1);
		
		a1 /= 5;
		System.out.println(a1);
		
		a2 %= a1;
		System.out.println(a2);
		
		
	}//main

}
