package ex4_static;

public class Bank {
	
	private String point;
	private String tel;
	static float interest = 10f;			//이자율
	
	public Bank(String point, String tel) {
		
		this.point = point;
		this.tel = tel;
		
	}
	
	//결과 출력용
	public void info() {
		System.out.println("위치: " + point);
		System.out.println("전화: " + tel);
		System.out.println("이자: " + interest);
		System.out.println("----------------");
	}
	
	
}
