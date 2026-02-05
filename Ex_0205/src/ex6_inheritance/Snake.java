package ex6_inheritance;

public class Snake extends Animal{
	
	String sensor = "밤에도 잘봄";
	
	
	//메서드의 오버라이딩
	//상속 관계의 객체에서 부모의 메서드와 동일한 이름의 메서드를
	//자식이 내용만 재정의 하여 사용하도록 하는 구조
	@Override
	public int getLeg() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
