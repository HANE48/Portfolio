package ex5_overload;

/*
 * 메서드 오버로드
 */

public class OverMain {

	public static void main(String[] args) {
		OverloadTest o = new OverloadTest();
		o.result();
		o.result(1);
		o.result('a');
		o.result("a");
		o.result(1, "a");
		o.result("a", 1);
		
		System.out.println();
		
	}//main

}
