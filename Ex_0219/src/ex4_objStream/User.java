package ex4_objStream;

import java.io.Serializable;


//User클래스는 추후 스트림으로 기록을 해야 하므로
//직렬화 작업을 수행해 둬야 한다.
public class User implements Serializable{		//Serializable을 명시만 해줘도 직렬화가 됨
	
	private static final long serialVersionUID = 1L;
	private String name, tel;
	private int age;
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printUser() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("tel: " + tel);
	}
	
	
}
