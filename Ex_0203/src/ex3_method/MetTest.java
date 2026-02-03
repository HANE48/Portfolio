package ex3_method;

public class MetTest {
	
	
	public int value(int n) {
		n+=10;
		System.out.println("n: " + n);
		//메서드의 작업을 마치고 딱 한개의 값을 가지고 
		//이 메서드를 호출한 곳으로 돌아간다.
		return n;
	}
	
	public void multi(int a1, int a2) {
		System.out.println(a1*a2);
	}
	
					//파라미터(인자, 매개변수)
	public void greet(String h) {
		System.out.println(h + "님 반갑습니다");
	}
	
	
	public void test1()
	{
		System.out.println("call test1");
		System.out.println("Welcome");
	}
}
