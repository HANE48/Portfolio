package ex1_String;

/*
 * String 클래스의 메서드들
 * 메서드: 어떤 작업을 수행하기 위한 명령문의 집합
 * 반복적인 코드 사용을 줄이기 위해 고안된 개념
 * 
 * wrapper 클래스 종류
 * int: Integer
 * char: Character
 * boolean: Boolean
 * byte: Byte
 * short: Short
 * long: Long
 * float: Float
 * double: Double
 */


public class Ex2_StringMethod {

	public static void main(String[] args) {
		
		String name = "Hong Gil Dong";	
		name.length();						//중요!
		System.out.println("name의 길이: " + name.length());
		
		int idx = name.indexOf('d');		//중복되면 앞의 자리의 인덱스를 반환함, 없으면 -1을 반환함
		System.out.println(idx);
		
		idx = name.lastIndexOf('o');		//중복되면 뒤의 자리의 인덱스를 반환함
		System.out.println(idx);
		
		idx = name.indexOf("Gil");			//문자열의 제일 앞의 문자열이 어디서부터 시작하는지 반환해줌
		System.out.println(idx);
		
		System.out.println(name.substring(0,4));	//subString은 시작점 부터 도착점 -1 까지의 문자열을 출력함
		
		
		String n2 = name.replace('o', '!');	//앞의 있는 문자를 뒤의 문자로 반환함
		System.out.println(n2);
		
		char ch = name.charAt(5);
		System.out.println(ch);
		
		String quiz = "apple";
		String ans = "Apple";
		
		if(quiz.equalsIgnoreCase(ans)) {						//equals는 대소문자를 확실히 구분하기 때문에 대소문자를 잘 구별!
																//대소문자를 구분하기 싫으면 IgnoreCase를 붙이면 대소문자를 무시하고 문자열끼리 비교를 실행함
			System.out.println("answer!!");
		}else {
			System.out.println("incorrect...");
		}

		String q1 = "abc";
		String q2 = " abc ";
		if(q1.equals(q2.trim())) {				//trim()을 사용하면 앞뒤의 공백을 제거해줌
			System.out.println("값이 같아요");
		}else {
			System.out.println("값이 틀려요");
		}
		
		String number = "98";					//정수형태의 문자열을 정수로 바꾸는 방법
		int num = Integer.parseInt(number);
		System.out.println(num+2);
		
		
		
		
	}//main

}
