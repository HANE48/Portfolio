package ex1_class;


public class ComMain {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		System.out.println("--c1--");
		c1.myPc();
		
		c2.hdd = 100;
		c2.color = "black";
		//brand는 private이므로 다른 클래스에서는 사용이 불가함
		//c2.brand = "apple";
		System.out.println("--c2--");
		c2.myPc();
		
	}

}
