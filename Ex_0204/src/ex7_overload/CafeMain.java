package ex7_overload;

/*
 * 1) 아는 정보가 없는경우 -> 주문을 접수했습니다 만 출력
 * 2) 수량만 아는 경우 -> 총 ??잔의 음료를 주문했습니다.
 * 3) 수량과 음료의 종류까지 아는 경우 -> 아메리카노 3잔을 주문했습니다.
 * 4) 수량, 음료이름, 음료 한 잔의 가격까지 아는 경우 -> 아메리카노 3잔 총 금액은 12,000원 입니다 출력 
 */

public class CafeMain {

	public static void main(String[] args) {
		
		CafeOrder co = new CafeOrder();
		
		co.printOrder();
		co.printOrder(3);
		co.printOrder("아메리카노", 3);
		co.printOrder(3, "아메리카노", 4400);
	
	}//main

}
