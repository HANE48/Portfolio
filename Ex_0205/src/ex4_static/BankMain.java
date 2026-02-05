package ex4_static;

public class BankMain {

	public static void main(String[] args) {
		
		Bank b1 = new Bank("강남", "02-111-1111");
		Bank b2 = new Bank("서현", "031-222-2222");
		Bank b3 = new Bank("마포", "02-333-3333");
		
		Bank.interest = 0.1f;		//static 변수는 클래스이름으로 접근하는걸 권장함 private이면 접근불가
		
		b1.info();
		b2.info();
		b3.info();
		
		
		
	}//main

}
