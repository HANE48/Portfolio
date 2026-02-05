package ex2_note;

public class Note {

	private String company = "바른손";
	private int page = 50;
	private int price = 1000;
	
	
	//생성자는 메모리 할당시 딱 한번만 호출된다.
	
	//이미 생성된 이후에는 다시 호출할 수 없다.
	public Note(int page, int price){
		this.page = page;
		this.price = price;
	}
	
	public Note() {
		
	}
	
	public void result() {
		System.out.println("company: " + company);
		System.out.println("page: " + page);
	}

	
}
