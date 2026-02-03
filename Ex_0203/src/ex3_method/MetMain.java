package ex3_method;

public class MetMain {

	public static void main(String[] args) {
		
		MetTest m1 = new MetTest();
		m1.test1();
		m1.test1();
		System.out.println("----------");
		m1.greet("홍길동");
		m1.multi(3,  5);
		
		int s = 100;
		s = m1.value(s);
		System.out.println(s);
		
	}//main

}

