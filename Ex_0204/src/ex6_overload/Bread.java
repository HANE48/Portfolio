package ex6_overload;

/*
 * 메서드 오버로드를 이용해 메서드 여러개 만들기
 * 
 */

public class Bread {
	
	
	
	public void makeBread() { 
		System.out.println("빵을 만들었습니다."); 
	}
	
	public void makeBread(int n) {
		while(n-->0) {
			System.out.println("빵을 만들었습니다.");
		}
	}
	
	public void makeBread(int n, String jong) {
		int i = n;
		while(n-->0) {
			System.out.println(jong + "빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + i + "개의 " + jong + "빵을 만들었습니다.");
	}
	
}
