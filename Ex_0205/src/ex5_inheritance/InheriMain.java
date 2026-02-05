package ex5_inheritance;

public class InheriMain {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.car = "소나타";
		Parent p1 = new Parent();
		
		//자식 클래스는 부모클래스의 속성이나 
		//메서드를 마음대로 가져다 쓸 수 있다.
		System.out.println(c1.car);
		System.out.println(c1.money);
		
		//자식클래스는 부모클래스의 것을 가져다 쓸 수 있지만
		//그 반대는 안됨
		System.out.println(p1.car);
		
	}//main 
}
