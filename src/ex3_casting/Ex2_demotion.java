package ex3_casting;

public class Ex2_demotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.디모션 캐스팅(강제 형변환)
		//작은 자료형에 큰 자료형이 대입되는 것(자동X)
		
		char c1 = 'D';
		int n1 = c1 + 1;	//프로모션 캐스팅
		System.out.println(n1 + "\n--------------------");
		
		c1 = (char)n1;		//디모션 캐스팅
		System.out.println(c1);
		
		float f = 5.5f;
		int n2 = (int)f;
		System.out.println(n2);
		
	}//main

}
