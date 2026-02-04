package ex5_overload;

/*
 * 메서드 오버로드(오버로딩)
 * 메서드의 중복정의 라고 하며 하나의 클래스 내에서 
 * 같은 이름을 가진 메서드가 여러개 정의되는것을 말함
 * 1)인자의 갯수가 다를 때
 * 2)인자의 타입이 다를 때
 * 3)인자의 갯수, 타입이 같지만 순서가 다를 때
 */

public class OverloadTest {
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}//result()
	
	public void result(int n){
		System.out.println("정수를 인자로 받는 메서드 ");
	}
	
	public void result(char c) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	public void result(String s) {
		System.out.println("문자열을 인자로 받는 메서드");
	}
	
	public void result(int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
	public void result(String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
	
}
