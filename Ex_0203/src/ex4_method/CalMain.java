package ex4_method;

public class CalMain {

	public static void main(String[] args) {
		
		Calc cal = new Calc();
		int result = cal.multi(2, 5);
		System.out.println(result);
		
		int asc = 70;
		char a = cal.myAsc(asc);
		System.out.println(a);
	}//main

}
