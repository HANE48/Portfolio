package ex1_class;

public class Computer {
	//클래스의 구성요소
	//1)변수, 속성, 멤버
	//2)메서드, 함수, 기능
	
	
	int hdd = 10;
	int ram = 256;
	float cpu = 1.5f;
	String color = "white";
	private String brand = "SAMSUNG";
	//메서드: 어떤 작업을 수행하기 위한 명령문의 집합
	//중복되는 코드를 줄이기 위해 사용
	
	//접근제한자 반환형 메서드명(파라미터, 인자) 메서드명은 반드시 소문자로 시작
	//public void myPc()
	
	public void myPc() {
		System.out.println("hdd: " + hdd);
		System.out.println("ram: " + ram);
		System.out.println("cpu: " + cpu);
		System.out.println("color: " + color);
		System.out.println("brand: " + brand);
		
	}//myPc
	
	/*
	 * 접근 제한자:
	 * 1) public: 같은 프로젝트의 모든 객체에게 사용을 허가
	 * 2) private: 현재 클래스에서만 사용을 허가
	 * 3) protected: 상속관계에서만 사용을 허가
	 * 3) default: 같은 패키지의 객체에게만 사용을 허가
	 */
	
	
	
}
