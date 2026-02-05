package ex7_override;

/*
 * 플러스 클래스에서 부모가 가진 객체를 호출하면 이름에 맞게 출력
 * 
 * plus:30
 * 
 */


public class CalMain {
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		Plus p = new Plus();
		Minus m = new Minus();
		
		System.out.println(p.getResult(n1, n2));
		System.out.println(m.getResult(n1, n2));
		
	}//main
	
}
