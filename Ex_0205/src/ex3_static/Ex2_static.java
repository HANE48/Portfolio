package ex3_static;

public class Ex2_static {
	
	int num1 = 100;
	static int num2 = 200;
	
	public static void result() {
		//static 메서드안에서는 일반 멤버변수를 참조 할 수 없다.
		//num1 = 150;
		
		//static메서드 안에서는 static변수만 찹조할 수 있다.
		num2 = 400;
	}
	
	public static void result2() {
		int n1 = 500;
		//static 메서드 안에서는 static변수를 선언할 수 없다.
//		static int n2 = 600;
	}
	
}
