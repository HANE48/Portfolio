package ex2_method;

public class MetMain {

	public static void main(String[] args) {
		MetTest mt = new MetTest();
		int n = 100;
		int[] arr = {5, 6, 7, 8};
		mt.value(n);
		
		System.out.println("n: " + n);
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}//main

}
