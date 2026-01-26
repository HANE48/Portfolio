package ex3_operand;

public class Ex2_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 비교연산자
		//변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1<n2);
		boolean res = n1 == n2;
		System.out.println(res);
		res = n1 != n2;
		System.out.println(res);
		
		System.out.println("-------------------------");
		//4. 논리연산자
		//비교연산자를 통한 연산이 2개 이상 사용될 때 그 사이를 연결
		int age = 24;
		int limit = 30;
		System.out.println((limit-age) >= 7 && age++ > 25);
		System.out.println(age);
		//&& and 연산자(그리고) 
		/*
		 	0 && 0 == false
		 	1 && 0 == false
		 	0 && 1 == false
		 	1 && 1 == true
		 	앞의 연산이 거짓이면 뒤의 연산은 시도도 안함
		 */
		
		int s1 = 10;
		int s2 = 20;
		res = (s1 += 10) >= 20 || s2 - 10 == 11;
		System.out.println(res);
		/* || or연산(또는)
		 * 0||0 == false
		 * 1||0 == true
		 * 0||1 == true
		 * 1||1 == true
		 * 연산 중 앞의 값이 참이면 뒤의 값을 계산 안함
		 */ 
		
		//!(not 연산)
		System.out.println("!연산 결과: " + !res);
		res = !res;
		System.out.println(res);
		
		// !true == false
		// !false == true
	}//main

}
