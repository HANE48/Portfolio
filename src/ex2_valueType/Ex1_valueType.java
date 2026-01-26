package ex2_valueType;

public class Ex1_valueType {

	public static void main(String[] args) {
		/*
		 기본 자료형
		 논리형: boolean == 1bit (0,1)
		 문자형: char == 2byte 
		 정수형: int == 4byte (-2147483648 ~ 2147483647) / long == 8byte (-900경 ~ 900경) / byte == 1byte (-128 ~ 127) / short == 2byte (-32768 ~ 32767)
		 실수형: float == 4byte / double == 8byte
		 
		 *변수( 값을 저장하는 공간 or 자료형의 식별을 위한 이름표 )
		 *1) 숫자로 시작할 수 없다
		 *2) 소문자로 시작
		 *3) _를 제외하고 특수문자 사용불가
		 *4) 예약어( for, if 등 ) 사용불가
		 *5) 의미있는 단어로 이름을 지을것
		 *6) 한글로 이름짓지 않는다.
		 *
		 *
		 * 자료형 변수명; <-- 변수의 선언 
		 * 변수명 = 값; <-- 대입 
		 * 자료형 변수명 = 값; <-- 초기화
		 */
		
		//논리형
		//논리형은 참(true), 거짓(false) 둘 중 하나의 값만 저장가능 
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println("---------------------------");
		//문자형(홑따옴표 안에 딱 한글자만 저장 가능한 자료형)
		char ch1 = 'A';
		System.out.println("ch1: " + ch1);
		ch1 = 66+1;
		System.out.println("ch1: " + ch1);
		System.out.println("---------------------------");
		//정수형
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 2200000000L;
		System.out.println(b + " \n" + s + "\n" + i + "\n" + l);
		System.out.println("---------------------------");
		//실수형
		float f = 0.05F;
		double d = 0.01;
		System.out.println("Float: " + f + "\nDouble: " + d );
		f = 100;
		System.out.println("Float: " + f + "\nDouble: " + d );
	}	

}
