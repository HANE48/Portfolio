package ex3_operand;

public class Ex3_operator {
	public static void main(String[] args) {
		//비트연산자
		//bit(2진수) 단위의 연산을 수행하는 연산자
		int a = 10;	//1010
		int b = 7;	//0111
		int c = a & b;	//0010
		System.out.println("논리곱(and): " + c);
		//2진수 변환시 두 값이 1일때만 1이고 나머지는 0
		
		c = a | b;	//1111
		System.out.println("논리합(OR): " + c);
		//2진수 변환 시 두 값이 모두 0일때만 0, 나머지는 1
		c = a ^ b;	//1101
		System.out.println("배타적(XOR): "+ c);
		//2진수 변환시 두 값이 같으면 0, 다르면 1
		
		System.out.println("-------------------");
		
		//시프트 연산자
		//왼쪽이나 오른쪽으로 이동시켜 값의 변화를 준다.
		
		int num = 12;	//1100
		int result = num >> 2;
		System.out.println(result);
						
		char ch = 'F';	//10001100
		char ch2 = (char)(ch>>1);
		result = ch >> 1;
		System.out.println(ch2);
		System.out.println(result);
	}//main
}

