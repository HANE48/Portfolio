package ex3_casting;

public class Ex1_promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 프로모션 캐스팅
		//큰 자료형에 작은 자료형을 대입(자동)
		double d1 = 100.5;
		int n1 = 200;
		d1 += n1;
		System.out.println("d1: " + d1);
		
		char c = 'A';	//2byte	
		int n2 = 100;	//4byte
		n2 = c;
		System.out.println(n2);
		
	}//main

}
