package ex3_static;

public class Ex1_static {
	
	String s1 = "일반 멤버 변수";
	static String s2 = "static 멤버 변수";
	
	
	public void result() {
		
		System.out.println(s1);

		//일반 메서드에서 스태틱 변수를 가져다 쓸 수 있다.
		System.out.println(s2);
		
	}
	
	public void result2() {
		
		String str1 = "일반 지역변수";
		//일반 메서드안에서는 static으로 선언이 불가능
		//static String str2 = "static 지역변수";
		
	}
	
}
