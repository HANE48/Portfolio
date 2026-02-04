package ex2_method;

public class MetTest {
	
	public void value(int n){
		n+=10;
		System.out.println("value_n: " + n);
	}
	
	public void metArr(int[] arr) {
		System.out.println("print in metArr");
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
