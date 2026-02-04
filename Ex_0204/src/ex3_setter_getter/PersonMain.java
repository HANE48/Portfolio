package ex3_setter_getter;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("hong");
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
	}//main

}
