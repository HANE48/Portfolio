package ex4_class_array;

public class PersonMain {

	public static void main(String[] args) {
		
		//클래스 배열은 클래스로 배열을 만들지만 생성자를 이용해 각 배열마다 객체를 생성해야함
		Person[] p = new Person[2];
		p[0] = new Person();		
		p[1] = new Person();
		
		p[0].setAge(10);
		p[0].setName("kim");
		
		p[1].setAge(20);
		p[1].setName("choi");
		
		for(int i=0 ; i<p.length ; i++) {
			System.out.println(p[i].getName() + " " + p[i].getAge());
		}
		
	}//main

}
