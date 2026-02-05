package ex8_work;

public class People {
	
	static String destiy = "bulguk";
	private String[] name;
	private int[] age;
	
	public People(int n) {
		this.name = new String[n];
		this.age = new int[n];
	}
	
	public void registerPeople(String name, int age, int index) {
		this.name[index] = name;
		this.age[index] = age;
		
	}
	
	public String getPeopleName(int index) {
		return name[index];
	}
	
	public int getPeopleAge(int index) {
		return age[index];
	}
	
}
