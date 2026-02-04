package ex7_overload;

/*
 * printOrder 메서드를 오버로딩 하기
 * 
 */


public class CafeOrder {
	
	public void printOrder() {
		System.out.println("주문을 접수했습니다.");
	}
	
	public void printOrder(int num) {
		System.out.println("총 " + num + "잔의 음료를 주문했습니다.");
	}
	
	public void printOrder(String str, int num) {
		System.out.println(str + " " + num + "잔을 주문했습니다.");
	}
	
	public void printOrder(int num, String name, int how) {
		System.out.println(name + " " + num +
				"잔 총 금액은 " + how*num + "원");
	}
	
	
}
